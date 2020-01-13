package com.changhongit.equinoxmanagement.response;

import java.util.List;

import com.changhongit.equinoxmanagement.bean.SimpleUser;
import com.changhongit.equinoxmanagement.bean.User;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("Get_SimpleUser_Response")
public class Get_SimpleUser_Response extends BaseResponse {
	@XStreamImplicit(itemFieldName = "User")
	@XStreamAlias("User")
	private List<SimpleUser> user;

	public Get_SimpleUser_Response(String returnValue) {
		this.setReturnValue(returnValue);
	}

	public List<SimpleUser> getUser() {
		return user;
	}

	public void setUser(List<SimpleUser> user) {
		this.user = user;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Get_SimpleUser_Response.class, User.class };
	}
}
