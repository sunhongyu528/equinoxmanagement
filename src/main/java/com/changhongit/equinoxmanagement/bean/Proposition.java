package com.changhongit.equinoxmanagement.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Proposition")
public class Proposition {

	@XStreamAlias("Number")
	private String number;

	@XStreamAlias("MinimumMeetingIDLength")
	private String minimumMeetingIDLength;

	@XStreamAlias("DefaultDuration")
	private String defaultDuration;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMinimumMeetingIDLength() {
		return minimumMeetingIDLength;
	}

	public void setMinimumMeetingIDLength(String minimumMeetingIDLength) {
		this.minimumMeetingIDLength = minimumMeetingIDLength;
	}

	public String getDefaultDuration() {
		return defaultDuration;
	}

	public void setDefaultDuration(String defaultDuration) {
		this.defaultDuration = defaultDuration;
	}

}
