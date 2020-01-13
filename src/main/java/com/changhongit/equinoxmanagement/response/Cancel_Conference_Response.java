package com.changhongit.equinoxmanagement.response;

import com.changhongit.equinoxmanagement.bean.Report;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Cancel_Conference_Response")
public class Cancel_Conference_Response extends BaseResponse {

	@XStreamAlias("Report")
	private Report report;

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getTypes() {
		return new Class[] { Cancel_Conference_Response.class };
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

}
