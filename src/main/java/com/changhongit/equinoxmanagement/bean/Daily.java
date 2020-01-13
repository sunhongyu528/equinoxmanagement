package com.changhongit.equinoxmanagement.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("Daily")
public class Daily {

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("NumberOfEveryDay")
	private String numberOfEveryDay;

	@XStreamAlias("EveryWeekDay")
	private boolean everyWeekDay;

	public String getNumberOfEveryDay() {
		return numberOfEveryDay;
	}

	public void setNumberOfEveryDay(String numberOfEveryDay) {
		this.numberOfEveryDay = numberOfEveryDay;
	}

	public boolean isEveryWeekDay() {
		return everyWeekDay;
	}

	public void setEveryWeekDay(boolean everyWeekDay) {
		this.everyWeekDay = everyWeekDay;
	}

}
