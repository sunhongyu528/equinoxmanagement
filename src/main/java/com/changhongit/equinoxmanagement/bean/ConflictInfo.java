package com.changhongit.equinoxmanagement.bean;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("ConflictInfo")
public class ConflictInfo {

	// User or Terminal
	@XStreamAlias("Category")
	private String category;

	// User ID or Terminal ID
	@XStreamAlias("Id")
	private String id;

	// User Name or Terminal Name
	@XStreamAlias("Name")
	private String name;

	// Conference Subject
	@XStreamAlias("Subject")
	@XStreamImplicit(itemFieldName = "Subject")
	private List<String> subject;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

}
