package com.changhongit.equinoxmanagement.bean;

import java.util.List;

import com.changhongit.equinoxmanagement.enums.AllowRecording;
import com.changhongit.equinoxmanagement.enums.AllowStreaming;
import com.changhongit.equinoxmanagement.enums.Priority;
import com.changhongit.equinoxmanagement.enums.Protocol;
import com.changhongit.equinoxmanagement.enums.StreamingStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("VirtualRoom")
public class VirtualRoom {

	@XStreamAlias("MemberId")
	private String memberId;

	@ApiModelProperty(required = true)
	@XStreamAlias("UserId")
	private String userId;

	@ApiModelProperty(required = true)
	@XStreamAlias("Number")
	private String number;

	@ApiModelProperty(required = true)
	@XStreamAlias("Name")
	private String name;

	@ApiModelProperty(required = true)
	@XStreamAlias("AccessPIN")
	private String accessPIN;

	@ApiModelProperty(required = true)
	@XStreamAlias("ModeratorPIN")
	private String moderatorPIN;

	@XStreamAlias("ServiceTemplateId")
	private String serviceTemplateId;

	@XStreamAlias("ServicePrefix")
	private String servicePrefix;

	@XStreamAlias("Priority")
	private Priority priority;

	@XStreamAlias("AllowStreaming")
	private AllowStreaming allowStreaming;

	@XStreamAlias("StreamingStatus")
	private StreamingStatus streamingStatus;

	@XStreamAlias("Attendee")
	private List<Attendee> attendee;

	@XStreamAlias("ReservedPorts")
	private ReservedPorts reservedPorts;

	@XStreamAlias("BlockDialIn")
	private boolean blockDialIn;

	@XStreamAlias("AutoExtend")
	private boolean autoExtend;

	@XStreamAlias("WaitingRoom")
	private boolean waitingRoom;

	@XStreamAlias("AdvancedProperties")
	private AdvancedProperties advancedProperties;

	@XStreamAlias("OneTimePINRequired")
	private boolean oneTimePINRequired;

	@XStreamAlias("Description")
	private String description;

	@JsonProperty("public")
	@XStreamAlias("Public")
	private boolean Public;

	@JsonProperty("default")
	@XStreamAlias("Default")
	private boolean Default;

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("MaxParticipants")
	private String maxParticipants;

	@XStreamAlias("AllowRecording")
	private AllowRecording allowRecording;

	@ApiModelProperty(required = false)
	@XStreamAlias("VirtualRoomId")
	private String virtualRoomId;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("AllowKnocking")
	private boolean allowKnocking;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("AllowInstantMeeting")
	private boolean allowInstantMeeting;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("DisabledDueToOwnerNoUCLicense")
	private boolean disabledDueToOwnerNoUCLicense;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("DisabledDueToSMInRestrictedMode")
	private boolean disabledDueToSMInRestrictedMode;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("ProtectMeeting")
	private boolean protectMeeting;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("VoicePromptLanguage")
	private String voicePromptLanguage;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("InvitationLanguage")
	private String invitationLanguage;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("DialInNumberInfo")
	private DialInNumberInfo dialInNumberInfo;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("FixedMeetingType")
	private boolean fixedMeetingType;

	@ApiModelProperty(required = false, hidden = true, value = "Number")
	@XStreamAlias("MaxPlayToneNumber")
	private String maxPlayToneNumber;

	@ApiModelProperty(required = false, hidden = true, value = "Number")
	@XStreamAlias("MaxPlayNameNumber")
	private String maxPlayNameNumber;

	@ApiModelProperty(required = false, hidden = true, value = "Number")
	@XStreamAlias("EntryAnnouncement")
	private String entryAnnouncement;

	@ApiModelProperty(required = false, hidden = true, value = "Number")
	@XStreamAlias("ExitAnnouncement")
	private String exitAnnouncement;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("Layout")
	@XStreamImplicit(itemFieldName = "Layout")
	private List<Layout> layout;

	@ApiModelProperty(required = false, hidden = true, value = "Number")
	@XStreamAlias("MaxRoomParticipants")
	private String maxRoomParticipants;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("Protocol")
	private Protocol protocol;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccessPIN() {
		return accessPIN;
	}

	public void setAccessPIN(String accessPIN) {
		this.accessPIN = accessPIN;
	}

	public String getModeratorPIN() {
		return moderatorPIN;
	}

	public void setModeratorPIN(String moderatorPIN) {
		this.moderatorPIN = moderatorPIN;
	}

	public boolean isWaitingRoom() {
		return waitingRoom;
	}

	public void setWaitingRoom(boolean waitingRoom) {
		this.waitingRoom = waitingRoom;
	}

	public List<Attendee> getAttendee() {
		return attendee;
	}

	public void setAttendee(List<Attendee> attendee) {
		this.attendee = attendee;
	}

	public ReservedPorts getReservedPorts() {
		return reservedPorts;
	}

	public void setReservedPorts(ReservedPorts reservedPorts) {
		this.reservedPorts = reservedPorts;
	}

	public AdvancedProperties getAdvancedProperties() {
		return advancedProperties;
	}

	public void setAdvancedProperties(AdvancedProperties advancedProperties) {
		this.advancedProperties = advancedProperties;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getServiceTemplateId() {
		return serviceTemplateId;
	}

	public void setServiceTemplateId(String serviceTemplateId) {
		this.serviceTemplateId = serviceTemplateId;
	}

	public String getServicePrefix() {
		return servicePrefix;
	}

	public void setServicePrefix(String servicePrefix) {
		this.servicePrefix = servicePrefix;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public AllowStreaming getAllowStreaming() {
		return allowStreaming;
	}

	public void setAllowStreaming(AllowStreaming allowStreaming) {
		this.allowStreaming = allowStreaming;
	}

	public StreamingStatus getStreamingStatus() {
		return streamingStatus;
	}

	public void setStreamingStatus(StreamingStatus streamingStatus) {
		this.streamingStatus = streamingStatus;
	}

	public boolean isBlockDialIn() {
		return blockDialIn;
	}

	public void setBlockDialIn(boolean blockDialIn) {
		this.blockDialIn = blockDialIn;
	}

	public boolean isAutoExtend() {
		return autoExtend;
	}

	public void setAutoExtend(boolean autoExtend) {
		this.autoExtend = autoExtend;
	}

	public boolean isOneTimePINRequired() {
		return oneTimePINRequired;
	}

	public void setOneTimePINRequired(boolean oneTimePINRequired) {
		this.oneTimePINRequired = oneTimePINRequired;
	}

	public String getVirtualRoomId() {
		return virtualRoomId;
	}

	public void setVirtualRoomId(String virtualRoomId) {
		this.virtualRoomId = virtualRoomId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublic() {
		return Public;
	}

	public void setPublic(boolean public1) {
		Public = public1;
	}

	public boolean isDefault() {
		return Default;
	}

	public void setDefault(boolean default1) {
		Default = default1;
	}

	public String getMaxParticipants() {
		return maxParticipants;
	}

	public void setMaxParticipants(String maxParticipants) {
		this.maxParticipants = maxParticipants;
	}

	public AllowRecording isAllowRecording() {
		return allowRecording;
	}

	public void setAllowRecording(AllowRecording allowRecording) {
		this.allowRecording = allowRecording;
	}

	public boolean isAllowKnocking() {
		return allowKnocking;
	}

	public void setAllowKnocking(boolean allowKnocking) {
		this.allowKnocking = allowKnocking;
	}

	public boolean isAllowInstantMeeting() {
		return allowInstantMeeting;
	}

	public void setAllowInstantMeeting(boolean allowInstantMeeting) {
		this.allowInstantMeeting = allowInstantMeeting;
	}

	public boolean isDisabledDueToOwnerNoUCLicense() {
		return disabledDueToOwnerNoUCLicense;
	}

	public void setDisabledDueToOwnerNoUCLicense(boolean disabledDueToOwnerNoUCLicense) {
		this.disabledDueToOwnerNoUCLicense = disabledDueToOwnerNoUCLicense;
	}

	public boolean isDisabledDueToSMInRestrictedMode() {
		return disabledDueToSMInRestrictedMode;
	}

	public void setDisabledDueToSMInRestrictedMode(boolean disabledDueToSMInRestrictedMode) {
		this.disabledDueToSMInRestrictedMode = disabledDueToSMInRestrictedMode;
	}

	public boolean isProtectMeeting() {
		return protectMeeting;
	}

	public void setProtectMeeting(boolean protectMeeting) {
		this.protectMeeting = protectMeeting;
	}

	public String getVoicePromptLanguage() {
		return voicePromptLanguage;
	}

	public void setVoicePromptLanguage(String voicePromptLanguage) {
		this.voicePromptLanguage = voicePromptLanguage;
	}

	public String getInvitationLanguage() {
		return invitationLanguage;
	}

	public void setInvitationLanguage(String invitationLanguage) {
		this.invitationLanguage = invitationLanguage;
	}

	public DialInNumberInfo getDialInNumberInfo() {
		return dialInNumberInfo;
	}

	public void setDialInNumberInfo(DialInNumberInfo dialInNumberInfo) {
		this.dialInNumberInfo = dialInNumberInfo;
	}

	public boolean isFixedMeetingType() {
		return fixedMeetingType;
	}

	public void setFixedMeetingType(boolean fixedMeetingType) {
		this.fixedMeetingType = fixedMeetingType;
	}

	public String getMaxPlayToneNumber() {
		return maxPlayToneNumber;
	}

	public void setMaxPlayToneNumber(String maxPlayToneNumber) {
		this.maxPlayToneNumber = maxPlayToneNumber;
	}

	public String getMaxPlayNameNumber() {
		return maxPlayNameNumber;
	}

	public void setMaxPlayNameNumber(String maxPlayNameNumber) {
		this.maxPlayNameNumber = maxPlayNameNumber;
	}

	public String getEntryAnnouncement() {
		return entryAnnouncement;
	}

	public void setEntryAnnouncement(String entryAnnouncement) {
		this.entryAnnouncement = entryAnnouncement;
	}

	public String getExitAnnouncement() {
		return exitAnnouncement;
	}

	public void setExitAnnouncement(String exitAnnouncement) {
		this.exitAnnouncement = exitAnnouncement;
	}

	public List<Layout> getLayout() {
		return layout;
	}

	public void setLayout(List<Layout> layout) {
		this.layout = layout;
	}

	public String getMaxRoomParticipants() {
		return maxRoomParticipants;
	}

	public void setMaxRoomParticipants(String maxRoomParticipants) {
		this.maxRoomParticipants = maxRoomParticipants;
	}

	public Protocol getProtocol() {
		return protocol;
	}

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}

}
