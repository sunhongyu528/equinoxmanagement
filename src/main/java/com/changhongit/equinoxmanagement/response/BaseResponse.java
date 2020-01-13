package com.changhongit.equinoxmanagement.response;

import com.changhongit.equinoxmanagement.request.IAnnotation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("BaseResponse")
public abstract class BaseResponse implements IAnnotation {
	@JsonIgnore
	@XStreamAlias("RequestID")
	private String requestID;

	@XStreamAlias("ReturnValue")
	private String returnValue;

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public String getReturnValue() {
		return returnValue;
	}

	public void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
	}

}
