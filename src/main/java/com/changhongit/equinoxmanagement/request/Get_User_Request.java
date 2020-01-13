package com.changhongit.equinoxmanagement.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("Get_User_Request")
public class Get_User_Request extends BaseRequest {

	@ApiModelProperty(required = true)
	@XStreamAlias("LoginId")
	private String loginId;

	@ApiModelProperty(required = false)
	@XStreamAlias("Detailed")
	private boolean detailed;

	@XStreamAlias("Length")
	private String length;

	public Get_User_Request(int requestId, String loginId) {
		this.setRequestID(requestId);
		this.loginId = loginId;
	}

	public Get_User_Request(int requestId) {
		this.setRequestID(requestId);
		length = "200";
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Get_User_Request.class };
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public boolean isDetailed() {
		return detailed;
	}

	public void setDetailed(boolean detailed) {
		this.detailed = detailed;
	}

}
