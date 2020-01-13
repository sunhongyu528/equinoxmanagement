package com.changhongit.equinoxmanagement.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("BaseRequest")
public abstract class BaseRequest implements IAnnotation {
	@JsonIgnore
	@XStreamAlias("RequestID")
	private int requestID;

	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

}
