package com.changhongit.equinoxmanagement.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("DialInNumberInfo")
public class DialInNumberInfo {

	@XStreamAlias("DialInNumberLocation")
	private String dialInNumberLocation;

	@XStreamAlias("DialInLabel")
	private String dialInLabel;

	@XStreamAlias("DialInNumber")
	private String dialInNumber;

	public String getDialInNumberLocation() {
		return dialInNumberLocation;
	}

	public void setDialInNumberLocation(String dialInNumberLocation) {
		this.dialInNumberLocation = dialInNumberLocation;
	}

	public String getDialInLabel() {
		return dialInLabel;
	}

	public void setDialInLabel(String dialInLabel) {
		this.dialInLabel = dialInLabel;
	}

	public String getDialInNumber() {
		return dialInNumber;
	}

	public void setDialInNumber(String dialInNumber) {
		this.dialInNumber = dialInNumber;
	}
}
