package com.changhongit.equinoxmanagement.bean;

public class AccessToken {
	private int tokenid;

	private int buildtime;

	private String token;

	private String loginId;

	private String password;

	public int getTokenid() {
		return tokenid;
	}

	public void setTokenid(int tokenid) {
		this.tokenid = tokenid;
	}

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

	public int getBuildtime() {
		return buildtime;
	}

	public void setBuildtime(int buildtime) {
		this.buildtime = buildtime;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Token [tokenid=" + tokenid + ", loginId=" + loginId + ", buildtime=" + buildtime + ", token=" + token
				+ "]";
	}
}
