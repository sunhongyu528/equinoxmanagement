package com.changhongit.equinoxmanagement.request;

import com.changhongit.equinoxmanagement.bean.AdvancedProperties;
import com.changhongit.equinoxmanagement.bean.Attendee;
import com.changhongit.equinoxmanagement.bean.CSRSetting;
import com.changhongit.equinoxmanagement.bean.Conference;
import com.changhongit.equinoxmanagement.bean.Daily;
import com.changhongit.equinoxmanagement.bean.Layout;
import com.changhongit.equinoxmanagement.bean.Monthly;
import com.changhongit.equinoxmanagement.bean.RecurrenceEnd;
import com.changhongit.equinoxmanagement.bean.ReservedPorts;
import com.changhongit.equinoxmanagement.bean.Weekly;
import com.changhongit.equinoxmanagement.enums.AllowStreaming;
import com.changhongit.equinoxmanagement.enums.Priority;
import com.changhongit.equinoxmanagement.enums.StreamingStatus;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Modify_Conference_Request")
public class Modify_Conference_Request extends BaseRequest {

	@XStreamAlias("Conference")
	private Conference conference;

	public Modify_Conference_Request(int requestId, Conference conference) {
		this.setRequestID(1);
		this.conference = conference;
	}

	public Conference getConference() {
		return conference;
	}

	public void setConference(Conference conference) {
		this.conference = conference;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Modify_Conference_Request.class, Conference.class, AdvancedProperties.class,
				Attendee.class, ReservedPorts.class, Daily.class, Weekly.class, Monthly.class, RecurrenceEnd.class,
				StreamingStatus.class, AllowStreaming.class, Priority.class, Layout.class, CSRSetting.class };
	}
}
