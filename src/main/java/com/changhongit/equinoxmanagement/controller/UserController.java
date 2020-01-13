package com.changhongit.equinoxmanagement.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.changhongit.equinoxmanagement.bean.AccessToken;
import com.changhongit.equinoxmanagement.bean.User;
import com.changhongit.equinoxmanagement.config.UserMap;
import com.changhongit.equinoxmanagement.config.UserTokenMap;
import com.changhongit.equinoxmanagement.request.Authenticate_User_Request;
import com.changhongit.equinoxmanagement.request.Create_User_Request;
import com.changhongit.equinoxmanagement.request.Delete_User_Request;
import com.changhongit.equinoxmanagement.request.Get_User_Request;
import com.changhongit.equinoxmanagement.request.Modify_User_Request;
import com.changhongit.equinoxmanagement.response.Authenticate_User_Response;
import com.changhongit.equinoxmanagement.response.BaseResponse;
import com.changhongit.equinoxmanagement.response.Create_User_Response;
import com.changhongit.equinoxmanagement.response.Delete_User_Response;
import com.changhongit.equinoxmanagement.response.Get_SimpleUser_Response;
import com.changhongit.equinoxmanagement.response.Get_User_Response;
import com.changhongit.equinoxmanagement.response.LoginResponse;
import com.changhongit.equinoxmanagement.response.Modify_User_Response;
import com.changhongit.equinoxmanagement.service.XmlService;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.swagger.annotations.Api;

@Api(value = "UserController", description = "User API")
@RestController
public class UserController {

	@Autowired
	XmlService xmlService;

	@Autowired
	UserMap userMap;

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public BaseResponse createUser(@RequestBody User user, HttpServletRequest request) {
		Create_User_Request create_User_Request = new Create_User_Request(1, user);
		return xmlService.sendRequest(create_User_Request, new Create_User_Response());
	}

	@RequestMapping(value = "/user/{userId}", method = RequestMethod.DELETE)
	public BaseResponse deleteUser(@PathVariable("userId") String userId, HttpServletRequest request) {
		Delete_User_Request roomRequest = new Delete_User_Request(1, userId);
		return xmlService.sendRequest(roomRequest, new Delete_User_Response());
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public BaseResponse modifyUser(@RequestBody User user, HttpServletRequest request) {
		Modify_User_Request modify_User_Request = new Modify_User_Request(1, user);
		return xmlService.sendRequest(modify_User_Request, new Modify_User_Response());
	}

	@RequestMapping(value = "/user/{loginId}", method = RequestMethod.GET)
	public BaseResponse getUser(@PathVariable("loginId") String loginId, HttpServletRequest request) {
		Get_User_Request get_User_Request = new Get_User_Request(2, loginId);
		return xmlService.sendRequest(get_User_Request, new Get_User_Response());
	}

	@RequestMapping(value = "/userList", method = RequestMethod.POST)
	public BaseResponse searchUser(@RequestParam(name = "condition", required = false) String condition,
			HttpServletRequest request) {
		Get_SimpleUser_Response get_SimpleUser_Response = new Get_SimpleUser_Response("OK");
		get_SimpleUser_Response.setUser(userMap.getUserList(condition));
		return get_SimpleUser_Response;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public LoginResponse login(@RequestBody Authenticate_User_Request requestUser, HttpServletRequest request,
			HttpServletResponse response) {
		LoginResponse loginResponse = new LoginResponse();
		// 判断用户信息为空
		if ("".equals(requestUser.getLoginId()) || "".equals(requestUser.getPassword())) {
			loginResponse.setReturnValue("传入的用户名/密码为空！");
			return loginResponse;
		}

		Authenticate_User_Response authResponse = (Authenticate_User_Response) authenticateUser(requestUser, request);
		if (authResponse == null || !authResponse.getReturnValue().equalsIgnoreCase("OK")) {
			loginResponse.setReturnValue(authResponse.getReturnValue());
			return loginResponse;
		}

		AccessToken accessToken = UserTokenMap.findByLoginId(requestUser.getLoginId());
		String TokenStr = "";
		Date date = new Date();
		int nowtime = (int) (date.getTime() / 1000);
		// 生成Token
		TokenStr = creatToken(requestUser, date);
		if (null == accessToken) {
			// 第一次登陆
			accessToken = new AccessToken();
			accessToken.setToken(TokenStr);
			accessToken.setBuildtime(nowtime);
			accessToken.setLoginId(requestUser.getLoginId());
			accessToken.setPassword(requestUser.getPassword());
			UserTokenMap.addToken(accessToken);
		} else {
			// 登陆就更新Token信息
			TokenStr = creatToken(requestUser, date);
			String oldTokenStr = accessToken.getToken();
			accessToken.setToken(TokenStr);
			accessToken.setBuildtime(nowtime);
			UserTokenMap.updataToken(oldTokenStr, accessToken);
		}
		// 返回Token信息给客户端
		loginResponse.setReturnValue("OK");
		loginResponse.setAccess_token(TokenStr);
		Get_User_Response get_User_Response = (Get_User_Response) getUser(requestUser.getLoginId(), request);
		loginResponse.setUser(get_User_Response.getUser().get(0));

		return loginResponse;
	}

	@RequestMapping(value = "/logout/{loginId}", method = RequestMethod.DELETE)
	public LoginResponse logout(@PathVariable("loginId") String loginId, HttpServletRequest request,
			HttpServletResponse response) {
		LoginResponse loginResponse = new LoginResponse();
		// 判断用户信息为空
		if (StringUtils.isEmpty(loginId)) {
			loginResponse.setReturnValue("传入的用户名为空！");
			return loginResponse;
		}

		UserTokenMap.deleteToken(loginId);
		loginResponse.setReturnValue("OK");
		return loginResponse;
	}

	private BaseResponse authenticateUser(@RequestBody Authenticate_User_Request requestUser,
			HttpServletRequest request) {
		return xmlService.sendRequest(requestUser, new Authenticate_User_Response());
	}

	// 生成Token信息方法（根据有效的用户信息）
	private String creatToken(Authenticate_User_Request user, Date date) {
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
		JwtBuilder builder = Jwts.builder().setHeaderParam("typ", "JWT") // 设置header
				.setHeaderParam("alg", "HS256").setIssuedAt(date) // 设置签发时间
				.setExpiration(new Date(date.getTime() + 1000 * 60 * 60 * 24 * 3))
				.claim("loginid", String.valueOf(user.getLoginId())) // 设置内容
				.setIssuer("lws")// 设置签发人
				.signWith(signatureAlgorithm, "changhongit"); // 签名，需要算法和key
		String jwt = builder.compact();
		return jwt;
	}

}
