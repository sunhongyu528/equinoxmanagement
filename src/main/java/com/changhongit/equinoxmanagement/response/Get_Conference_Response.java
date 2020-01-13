package com.changhongit.equinoxmanagement.response;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("Get_Conference_Response")
public class Get_Conference_Response extends BaseResponse {

	@XStreamImplicit(itemFieldName = "Conference")
	@XStreamAlias("Conference")
	private List<Conference> conference;

	public List<Conference> getConference() {
		return conference;
	}

	public void setConference(List<Conference> conference) {
		this.conference = conference;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Get_Conference_Response.class, Conference.class, AdvancedProperties.class, Attendee.class,
				ReservedPorts.class, Daily.class, Weekly.class, Monthly.class, RecurrenceEnd.class,
				StreamingStatus.class, AllowStreaming.class, Priority.class, Layout.class, CSRSetting.class };
	}

	public void filterConference(String userId) {
		if (conference != null && conference.size() > 0) {
			Iterator<Conference> it = conference.iterator();
			while (it.hasNext()) {
				Conference c = it.next();
				if (!c.getUserId().equals(userId)) {
					it.remove();
				}
			}
		} else {
			conference = new ArrayList<Conference>();
		}
	}
}
