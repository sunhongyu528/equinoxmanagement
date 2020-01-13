package com.changhongit.equinoxmanagement.response;

import com.changhongit.equinoxmanagement.bean.Report;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Schedule_Conference_Response")
public class Schedule_Conference_Response extends BaseResponse {

	@XStreamAlias("Report")
	private Report report;

	@XStreamAlias("RecurringConfReport")
	private String recurringConfReport;

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public String getRecurringConfReport() {
		return recurringConfReport;
	}

	public void setRecurringConfReport(String recurringConfReport) {
		this.recurringConfReport = recurringConfReport;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Schedule_Conference_Response.class, Report.class };
	}

}
