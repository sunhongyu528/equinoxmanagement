package com.changhongit.equinoxmanagement.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Delete_Virtual_Room_Request")
public class Delete_Virtual_Room_Request extends BaseRequest {

	public Delete_Virtual_Room_Request(int requestId, String roomId) {
		setRequestID(requestId);
		virtualRoomId = roomId;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Delete_Virtual_Room_Request.class };
	}

	@XStreamAlias("VirtualRoomId")
	private String virtualRoomId;

	public String getVirtualRoomId() {
		return virtualRoomId;
	}

	public void setVirtualRoomId(String virtualRoomId) {
		this.virtualRoomId = virtualRoomId;
	}

}
