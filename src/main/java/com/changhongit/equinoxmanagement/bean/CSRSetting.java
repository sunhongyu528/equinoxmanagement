package com.changhongit.equinoxmanagement.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("CSRSetting")
public class CSRSetting {

	@XStreamAlias("Public")
	private boolean _Public;

	@XStreamAlias("QandAEnabled")
	private boolean qandAEnabled;

	@XStreamAlias("AccessModeSetting")
	private String accessModeSetting;

	public boolean is_Public() {
		return _Public;
	}

	public void set_Public(boolean _Public) {
		this._Public = _Public;
	}

	public boolean isQandAEnabled() {
		return qandAEnabled;
	}

	public void setQandAEnabled(boolean qandAEnabled) {
		this.qandAEnabled = qandAEnabled;
	}

	public String getAccessModeSetting() {
		return accessModeSetting;
	}

	public void setAccessModeSetting(String accessModeSetting) {
		this.accessModeSetting = accessModeSetting;
	}

}
