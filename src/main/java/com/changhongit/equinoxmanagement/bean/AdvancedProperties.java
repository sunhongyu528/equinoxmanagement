package com.changhongit.equinoxmanagement.bean;

import com.changhongit.equinoxmanagement.enums.TerminationCondition;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("AdvancedProperties")
public class AdvancedProperties {

	@XStreamAlias("DurationAfterLeft")
	private String durationAfterLeft;

	@XStreamAlias("TerminationCondition")
	private TerminationCondition terminationCondition;

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("MaxParticipants")
	private String maxParticipants;

	@XStreamAlias("EnableMCUCascading")
	private boolean enableMCUCascading;

	@XStreamAlias("AllowDynamicGrow")
	private boolean allowDynamicGrow;

	@XStreamAlias("AlertDurationBeforeTermination")
	private String alertDurationBeforeTermination;

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("MaxRoomParticipants")
	private String maxRoomParticipants;

	public String getDurationAfterLeft() {
		return durationAfterLeft;
	}

	public void setDurationAfterLeft(String durationAfterLeft) {
		this.durationAfterLeft = durationAfterLeft;
	}

	public TerminationCondition getTerminationCondition() {
		return terminationCondition;
	}

	public void setTerminationCondition(TerminationCondition terminationCondition) {
		this.terminationCondition = terminationCondition;
	}

	public String getMaxParticipants() {
		return maxParticipants;
	}

	public void setMaxParticipants(String maxParticipants) {
		this.maxParticipants = maxParticipants;
	}

	public boolean isEnableMCUCascading() {
		return enableMCUCascading;
	}

	public void setEnableMCUCascading(boolean enableMCUCascading) {
		this.enableMCUCascading = enableMCUCascading;
	}

	public boolean isAllowDynamicGrow() {
		return allowDynamicGrow;
	}

	public void setAllowDynamicGrow(boolean allowDynamicGrow) {
		this.allowDynamicGrow = allowDynamicGrow;
	}

	public String getAlertDurationBeforeTermination() {
		return alertDurationBeforeTermination;
	}

	public void setAlertDurationBeforeTermination(String alertDurationBeforeTermination) {
		this.alertDurationBeforeTermination = alertDurationBeforeTermination;
	}

	public String getMaxRoomParticipants() {
		return maxRoomParticipants;
	}

	public void setMaxRoomParticipants(String maxRoomParticipants) {
		this.maxRoomParticipants = maxRoomParticipants;
	}
}
