package com.changhongit.equinoxmanagement.response;

import com.changhongit.equinoxmanagement.bean.ConflictInfo;
import com.changhongit.equinoxmanagement.bean.Report;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Modify_Conference_Response")
public class Modify_Conference_Response extends BaseResponse {

	@XStreamAlias("Report")
	private Report report;

	@XStreamAlias("Detail")
	private String detail;

	@XStreamAlias("ConferenceId")
	private int conferenceId;

	@XStreamAlias("Number")
	private int number;

	@XStreamAlias("ConflictInfo")
	private ConflictInfo conflictInfo;

	@XStreamAlias("RecurringConfReport")
	private String recurringConfReport;

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Modify_Conference_Response.class, Report.class, ConflictInfo.class };
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getConferenceId() {
		return conferenceId;
	}

	public void setConferenceId(int conferenceId) {
		this.conferenceId = conferenceId;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public ConflictInfo getConflictInfo() {
		return conflictInfo;
	}

	public void setConflictInfo(ConflictInfo conflictInfo) {
		this.conflictInfo = conflictInfo;
	}

	public String getRecurringConfReport() {
		return recurringConfReport;
	}

	public void setRecurringConfReport(String recurringConfReport) {
		this.recurringConfReport = recurringConfReport;
	}
}
