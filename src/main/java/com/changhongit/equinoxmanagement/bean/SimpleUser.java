package com.changhongit.equinoxmanagement.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("User")
public class SimpleUser {
	private String loginID;

	private String firstName;

	private String lastName;

	private String userId;

	private String eMail;

	public SimpleUser(String loginID, String firstName, String lastName, String userId, String eMail) {
		this.loginID = loginID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.eMail = eMail;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
}
