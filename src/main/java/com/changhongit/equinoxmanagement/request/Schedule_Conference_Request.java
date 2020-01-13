package com.changhongit.equinoxmanagement.request;

import com.changhongit.equinoxmanagement.bean.AdvancedProperties;
import com.changhongit.equinoxmanagement.bean.Conference;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Schedule_Conference_Request")
public class Schedule_Conference_Request extends BaseRequest {

	@XStreamAlias("Conference")
	private Conference conference;

	public Schedule_Conference_Request(int requestId, Conference conference) {
		this.setRequestID(requestId);
		this.conference = conference;
	}

	public Conference getConference() {
		return conference;
	}

	public void setConference(Conference conference) {
		this.conference = conference;
	}

	@SuppressWarnings("rawtypes")
	public Class[] getTypes() {
		return new Class[] { Schedule_Conference_Request.class, Conference.class, AdvancedProperties.class };
	}
}
