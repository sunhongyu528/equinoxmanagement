package com.changhongit.equinoxmanagement.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Layout")
public class Layout {

	@XStreamAlias("LayoutName")
	private String layoutName;

	@XStreamAlias("LayoutType")
	private String layoutType;

	@XStreamAlias("Dynamic")
	private boolean dynamic;

	@XStreamAlias("NoSelfSee")
	private boolean noSelfSee;

	public String getLayoutName() {
		return layoutName;
	}

	public void setLayoutName(String layoutName) {
		this.layoutName = layoutName;
	}

	public String getLayoutType() {
		return layoutType;
	}

	public void setLayoutType(String layoutType) {
		this.layoutType = layoutType;
	}

	public boolean isDynamic() {
		return dynamic;
	}

	public void setDynamic(boolean dynamic) {
		this.dynamic = dynamic;
	}

	public boolean isNoSelfSee() {
		return noSelfSee;
	}

	public void setNoSelfSee(boolean noSelfSee) {
		this.noSelfSee = noSelfSee;
	}
}
