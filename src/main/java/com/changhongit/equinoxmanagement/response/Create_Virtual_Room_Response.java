package com.changhongit.equinoxmanagement.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Create_Virtual_Room_Response")
public class Create_Virtual_Room_Response extends BaseResponse {

	@XStreamAlias("VirtualRoomeId")
	private int virtualRoomeId;

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Create_Virtual_Room_Response.class };
	}

	public int getVirtualRoomeId() {
		return virtualRoomeId;
	}

	public void setVirtualRoomeId(int virtualRoomeId) {
		this.virtualRoomeId = virtualRoomeId;
	}
}
