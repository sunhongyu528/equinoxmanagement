package com.changhongit.equinoxmanagement.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Create_User_Response")
public class Create_User_Response extends BaseResponse {

	@XStreamAlias("UserId")
	private String userId;

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Create_User_Response.class };
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
