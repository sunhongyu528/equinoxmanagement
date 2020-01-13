package com.changhongit.equinoxmanagement.response;

import java.util.List;

import com.changhongit.equinoxmanagement.bean.User;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("Get_User_Response")
public class Get_User_Response extends BaseResponse {

	@XStreamImplicit(itemFieldName = "User")
	@XStreamAlias("User")
	private List<User> user;

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Get_User_Response.class, User.class };
	}
}
