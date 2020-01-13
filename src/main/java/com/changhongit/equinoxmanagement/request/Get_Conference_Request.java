package com.changhongit.equinoxmanagement.request;

import java.util.Date;

import com.changhongit.equinoxmanagement.bean.Criteria;
import com.changhongit.equinoxmanagement.bean.Entry;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("Get_Conference_Request")
public class Get_Conference_Request extends BaseRequest {

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("MemberId")
	private String memberId;

	@ApiModelProperty(required = true)
	@XStreamAlias("ConferenceId")
	private String conferenceId;

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("Number")
	private String number;

	@XStreamAlias("StartTime")
	private Date startTime;

	@XStreamAlias("Criteria")
	private Criteria criteria;

	public Get_Conference_Request(int requestId, String conferenceId) {
		this.setRequestID(requestId);
		this.conferenceId = conferenceId;
	}

	public Get_Conference_Request(int requestId, Criteria criteria) {
		this.setRequestID(requestId);
		this.criteria = criteria;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Get_Conference_Request.class, Criteria.class, Entry.class };
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Criteria getCriteria() {
		return criteria;
	}

	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}

}
