package com.changhongit.equinoxmanagement.request;

import com.changhongit.equinoxmanagement.bean.User;
import com.changhongit.equinoxmanagement.enums.AllowRecording;
import com.changhongit.equinoxmanagement.enums.AllowStreaming;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Create_User_Request")
public class Create_User_Request extends BaseRequest {

	@XStreamAlias("User")
	private User user;

	public Create_User_Request(int requestId, User user) {
		setRequestID(requestId);
		this.user = user;
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
		return new Class[] { Create_User_Request.class, User.class, AllowStreaming.class, AllowRecording.class };
	}

}
