package com.changhongit.equinoxmanagement.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("DayOfNumberOfEveryMonth")
public class DayOfNumberOfEveryMonth {

	@XStreamAlias("WeekOfMonth")
	private String weekOfMonth;

	@XStreamAlias("DayOfWeek")
	private String dayOfWeek;

	public String getWeekOfMonth() {
		return weekOfMonth;
	}

	public void setWeekOfMonth(String weekOfMonth) {
		this.weekOfMonth = weekOfMonth;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
}
