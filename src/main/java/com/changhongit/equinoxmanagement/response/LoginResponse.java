package com.changhongit.equinoxmanagement.response;

import com.changhongit.equinoxmanagement.bean.User;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class LoginResponse extends BaseResponse {

	private String access_token;

	@XStreamAlias("User")
	private User user;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { LoginResponse.class, User.class };
	}

}
