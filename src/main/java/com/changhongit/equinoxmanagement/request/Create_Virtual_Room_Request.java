package com.changhongit.equinoxmanagement.request;

import com.changhongit.equinoxmanagement.bean.AdvancedProperties;
import com.changhongit.equinoxmanagement.bean.Attendee;
import com.changhongit.equinoxmanagement.bean.DialInNumberInfo;
import com.changhongit.equinoxmanagement.bean.Layout;
import com.changhongit.equinoxmanagement.bean.ReservedPorts;
import com.changhongit.equinoxmanagement.bean.VirtualRoom;
import com.changhongit.equinoxmanagement.enums.AllowRecording;
import com.changhongit.equinoxmanagement.enums.AllowStreaming;
import com.changhongit.equinoxmanagement.enums.Priority;
import com.changhongit.equinoxmanagement.enums.Protocol;
import com.changhongit.equinoxmanagement.enums.StreamingStatus;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Create_Virtual_Room_Request")
public class Create_Virtual_Room_Request extends BaseRequest {

	@XStreamAlias("VirtualRoom")
	private VirtualRoom virtualRoom;

	public Create_Virtual_Room_Request(int requestId, VirtualRoom virtualRoom) {
		this.setRequestID(requestId);
		this.virtualRoom = virtualRoom;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Create_Virtual_Room_Request.class, VirtualRoom.class, Attendee.class, ReservedPorts.class,
				AdvancedProperties.class, Priority.class, AllowStreaming.class, StreamingStatus.class,
				AllowRecording.class, DialInNumberInfo.class, Layout.class, Protocol.class };
	}

	public VirtualRoom getVirtualRoom() {
		return virtualRoom;
	}

	public void setVirtualRoom(VirtualRoom virtualRoom) {
		this.virtualRoom = virtualRoom;
	}
}
