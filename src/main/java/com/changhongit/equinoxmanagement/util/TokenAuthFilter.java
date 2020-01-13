package com.changhongit.equinoxmanagement.util;

import java.io.IOException;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.filter.GenericFilterBean;

import com.changhongit.equinoxmanagement.bean.AccessToken;
import com.changhongit.equinoxmanagement.config.UserTokenMap;
import com.google.common.collect.Maps;

@Component
public class TokenAuthFilter extends GenericFilterBean {

//	@Autowired
//	private Environment env;
//
//	@Autowired(required=true)
//	private RestTemplate restTemplate;

	Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;
		String requestURI = httpServletRequest.getRequestURI();
		String method = httpServletRequest.getMethod();

		if (requestURI.endsWith(".js") || requestURI.endsWith(".css") || requestURI.endsWith(".png")) {
			chain.doFilter(request, response);
			return;
		}

		if (fuzzymatching(requestURI, method)) {
			chain.doFilter(request, response);
			return;
		}

		if (requestURI.startsWith("/login") || requestURI.startsWith("/user")|| requestURI.startsWith("/logout")) {
			chain.doFilter(request, response);
			return;
		}

		String tokenStr = httpServletRequest.getHeader("access_token");
		if (StringUtils.isEmpty(tokenStr)) {
			servletResponse.sendError(401, "No access token found in http header 'access_token'");
			return;
		}

		try {
			AccessToken token = UserTokenMap.getToken(tokenStr);
			if (token == null) {
				servletResponse.sendError(401, "This request requires HTTP authentication");
				return;
			}
		} catch (HttpClientErrorException clientError) {
			servletResponse.sendError(403, "Your access token is invalid or expired.");
			return;
		} catch (Exception e) {
			servletResponse.sendError(500, "Server error during validating your access token");
			return;
		}
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}

//	private void authUserByToken(String tokenRaw) throws Exception {
//		String url = String.format(env.getProperty("checkToken.endpoint"), tokenRaw);
//		restTemplate.getForObject(url, AccessToken.class);
//	}

	// 跳过check_Token
	public Map<String, String> filterExclude() {
		Map<String, String> map = Maps.newHashMap();
		map.put("/login", "POST");
		map.put("/user", "GET");
		map.put("/user", "POST");
		map.put("/swagger-ui.html", "GET");
		map.put("/webjars", "GET");
		map.put("/swagger-resources", "GET");
		map.put("/v2/api-docs", "GET");
		return map;
	}

	public boolean fuzzymatching(String requestURI, String method) {

		Map<String, String> map = filterExclude();
		for (String path : map.keySet()) {
			String value = map.get(path);
			if (requestURI.startsWith(path) && method.equals(value)) {
				return true;
			}
		}

		return false;
	}
}
