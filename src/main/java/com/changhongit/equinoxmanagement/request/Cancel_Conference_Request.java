package com.changhongit.equinoxmanagement.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("Cancel_Conference_Request")
public class Cancel_Conference_Request extends BaseRequest {

	@ApiModelProperty(required = true)
	@XStreamAlias("ConferenceId")
	private Long conferenceId;

	@XStreamAlias("StartTime")
	private String startTime;

	public Cancel_Conference_Request(int requestId, Long conferenceId) {
		this.setRequestID(requestId);
		this.conferenceId = conferenceId;
//		this.startTime = startTime;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Cancel_Conference_Request.class };
	}

	public Long getConferenceId() {
		return conferenceId;
	}

	public void setConferenceId(Long conferenceId) {
		this.conferenceId = conferenceId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
}
