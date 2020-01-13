package com.changhongit.equinoxmanagement.request;

import com.changhongit.equinoxmanagement.bean.User;
import com.changhongit.equinoxmanagement.enums.AllowRecording;
import com.changhongit.equinoxmanagement.enums.AllowStreaming;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("Modify_User_Request")
public class Modify_User_Request extends BaseRequest {

	@ApiModelProperty(required = true)
	@XStreamAlias("User")
	private User user;

	public Modify_User_Request(int requestId, User user) {
		this.setRequestID(requestId);
		this.user = user;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Modify_User_Request.class, User.class, AllowStreaming.class, AllowRecording.class };
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
