package com.changhongit.equinoxmanagement.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("ReservedPorts")
public class ReservedPorts {

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("Regular")
	private String regular;

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("SD")
	private String SD;

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("HD")
	private String HD;

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("FullHD")
	private String FullHD;

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("AudioOnlyWC")
	private String AudioOnlyWC;

	public String getRegular() {
		return regular;
	}

	public void setRegular(String regular) {
		this.regular = regular;
	}

	public String getSD() {
		return SD;
	}

	public void setSD(String sD) {
		SD = sD;
	}

	public String getHD() {
		return HD;
	}

	public void setHD(String hD) {
		HD = hD;
	}

	public String getFullHD() {
		return FullHD;
	}

	public void setFullHD(String fullHD) {
		FullHD = fullHD;
	}

	public String getAudioOnlyWC() {
		return AudioOnlyWC;
	}

	public void setAudioOnlyWC(String audioOnlyWC) {
		AudioOnlyWC = audioOnlyWC;
	}
}
