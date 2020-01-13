package com.changhongit.equinoxmanagement.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("Authenticate_User_Request")
public class Authenticate_User_Request extends BaseRequest {

	@ApiModelProperty(required = true)
	@XStreamAlias("LoginId")
	private String loginId;

	@ApiModelProperty(required = true)
	@XStreamAlias("Password")
	private String password;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Authenticate_User_Request.class };
	}
}
