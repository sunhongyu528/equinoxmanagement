package com.changhongit.equinoxmanagement.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Delete_User_Response")
public class Delete_User_Response extends BaseResponse {

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Delete_User_Response.class };
	}

}
