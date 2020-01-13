package com.changhongit.equinoxmanagement.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("Weekly")
public class Weekly {

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("NumberOfEveryWeek")
	private String numberOfEveryWeek;

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("DayOfWeek")
	private String dayOfWeek;

	public String getNumberOfEveryWeek() {
		return numberOfEveryWeek;
	}

	public void setNumberOfEveryWeek(String numberOfEveryWeek) {
		this.numberOfEveryWeek = numberOfEveryWeek;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
}
