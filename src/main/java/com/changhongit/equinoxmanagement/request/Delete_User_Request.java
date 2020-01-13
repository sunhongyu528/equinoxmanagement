package com.changhongit.equinoxmanagement.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Delete_User_Request")
public class Delete_User_Request extends BaseRequest {

	@XStreamAlias("MemberId")
	private String memberId;

	@XStreamAlias("UserId")
	private String userId;

	public Delete_User_Request(int requestId, String userId) {
		this.setRequestID(requestId);
		this.userId = userId;
//		this.memberId = memberId;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Delete_User_Request.class };
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
