package com.changhongit.equinoxmanagement.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Modify_Virtual_Room_Response")
public class Modify_Virtual_Room_Response extends BaseResponse {
	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Modify_Virtual_Room_Response.class };
	}
}
