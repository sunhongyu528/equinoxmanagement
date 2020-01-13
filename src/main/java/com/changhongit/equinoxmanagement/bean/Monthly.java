package com.changhongit.equinoxmanagement.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("Monthly")
public class Monthly {

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("NumberOfEveryMonth")
	private String numberOfEveryMonth;

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("DayOfMonth")
	private String dayOfMonth;

	@XStreamAlias("DayOfNumberOfEveryMonth")
	private DayOfNumberOfEveryMonth dayOfNumberOfEveryMonth;

	public String getNumberOfEveryMonth() {
		return numberOfEveryMonth;
	}

	public void setNumberOfEveryMonth(String numberOfEveryMonth) {
		this.numberOfEveryMonth = numberOfEveryMonth;
	}

	public String getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(String dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public DayOfNumberOfEveryMonth getDayOfNumberOfEveryMonth() {
		return dayOfNumberOfEveryMonth;
	}

	public void setDayOfNumberOfEveryMonth(DayOfNumberOfEveryMonth dayOfNumberOfEveryMonth) {
		this.dayOfNumberOfEveryMonth = dayOfNumberOfEveryMonth;
	}
}
