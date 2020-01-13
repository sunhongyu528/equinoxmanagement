package com.changhongit.equinoxmanagement.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("RecurrenceEnd")
public class RecurrenceEnd {

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("EndOfOccurrences")
	private int endOfOccurrences;

	@XStreamAlias("By")
	private String by;

	public int getEndOfOccurrences() {
		return endOfOccurrences;
	}

	public void setEndOfOccurrences(int endOfOccurrences) {
		this.endOfOccurrences = endOfOccurrences;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}
}
