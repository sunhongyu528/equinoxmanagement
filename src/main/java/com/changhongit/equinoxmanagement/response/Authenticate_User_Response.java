package com.changhongit.equinoxmanagement.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Authenticate_User_Response")
public class Authenticate_User_Response extends BaseResponse {

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Authenticate_User_Response.class };
	}
}
