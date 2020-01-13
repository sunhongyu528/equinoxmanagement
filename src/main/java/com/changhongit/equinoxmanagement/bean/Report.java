package com.changhongit.equinoxmanagement.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("Report")
public class Report {

	@XStreamAlias("Success")
	private boolean success;

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("ConferenceId")
	private String conferenceId;

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("Number")
	private String number;

	@XStreamAlias("ErrorCode")
	private String errorCode;

	@XStreamAlias("Detail")
	private String detail;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getConferenceId() {
		return conferenceId;
	}

	public void setConferenceId(String conferenceId) {
		this.conferenceId = conferenceId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
