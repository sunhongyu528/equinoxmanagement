package com.changhongit.equinoxmanagement.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Delete_Virtual_Room_Response")
public class Delete_Virtual_Room_Response extends BaseResponse {

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Delete_Virtual_Room_Response.class };
	}
}
