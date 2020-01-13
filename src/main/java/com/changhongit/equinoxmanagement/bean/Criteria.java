package com.changhongit.equinoxmanagement.bean;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("Criteria")
public class Criteria {
	@XStreamImplicit(itemFieldName = "Entry")
	@XStreamAlias("Entry")
	private List<Entry> entry;

	public List<Entry> getEntry() {
		return entry;
	}

	public void setEntry(List<Entry> entry) {
		this.entry = entry;
	}

}
