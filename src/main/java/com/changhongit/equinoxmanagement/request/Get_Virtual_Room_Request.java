package com.changhongit.equinoxmanagement.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("Get_Virtual_Room_Request")
public class Get_Virtual_Room_Request extends BaseRequest {

	@ApiModelProperty(required = true)
	@XStreamAlias("VirtualRoomId")
	private int virtualRoomId;

	@ApiModelProperty(required = true)
	@XStreamAlias("VirtualRoomName")
	private String virtualRoomName;

	@ApiModelProperty(required = true)
	@XStreamAlias("DialableNumber")
	private String dialableNumber;

	@ApiModelProperty(required = true)
	@XStreamAlias("LoginId")
	private String loginId;

	@ApiModelProperty(required = true)
	@XStreamAlias("UserId")
	private String userId;

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Get_Virtual_Room_Request.class };
	}

	public int getVirtualRoomId() {
		return virtualRoomId;
	}

	public void setVirtualRoomId(int virtualRoomId) {
		this.virtualRoomId = virtualRoomId;
	}

	public String getVirtualRoomName() {
		return virtualRoomName;
	}

	public void setVirtualRoomName(String virtualRoomName) {
		this.virtualRoomName = virtualRoomName;
	}

	public String getDialableNumber() {
		return dialableNumber;
	}

	public void setDialableNumber(String dialableNumber) {
		this.dialableNumber = dialableNumber;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
