package com.changhongit.equinoxmanagement.response;

import com.changhongit.equinoxmanagement.bean.AdvancedProperties;
import com.changhongit.equinoxmanagement.bean.Attendee;
import com.changhongit.equinoxmanagement.bean.DialInNumberInfo;
import com.changhongit.equinoxmanagement.bean.Layout;
import com.changhongit.equinoxmanagement.bean.Proposition;
import com.changhongit.equinoxmanagement.bean.ReservedPorts;
import com.changhongit.equinoxmanagement.bean.VirtualRoom;
import com.changhongit.equinoxmanagement.enums.AllowRecording;
import com.changhongit.equinoxmanagement.enums.AllowStreaming;
import com.changhongit.equinoxmanagement.enums.Priority;
import com.changhongit.equinoxmanagement.enums.Protocol;
import com.changhongit.equinoxmanagement.enums.StreamingStatus;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Get_Virtual_Room_Response")
public class Get_Virtual_Room_Response extends BaseResponse {

	@XStreamAlias("VirtualRoom")
	private VirtualRoom virtualRoom;

	@XStreamAlias("Proposition")
	private Proposition proposition;

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Get_Virtual_Room_Response.class, Proposition.class, VirtualRoom.class, Attendee.class,
				ReservedPorts.class, AdvancedProperties.class, Priority.class, AllowStreaming.class,
				StreamingStatus.class, AllowRecording.class, DialInNumberInfo.class, Layout.class, Protocol.class };
	}

	public VirtualRoom getVirtualRoom() {
		return virtualRoom;
	}

	public void setVirtualRoom(VirtualRoom virtualRoom) {
		this.virtualRoom = virtualRoom;
	}

	public Proposition getProposition() {
		return proposition;
	}

	public void setProposition(Proposition proposition) {
		this.proposition = proposition;
	}

}
