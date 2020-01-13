package com.changhongit.equinoxmanagement.bean;

import com.changhongit.equinoxmanagement.enums.AllowRecording;
import com.changhongit.equinoxmanagement.enums.AllowStreaming;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("User")
public class User {

	// @JsonProperty("LoginID")//接受request时，对应jason的首字母大写字段
	@ApiModelProperty(required = true)
	@XStreamAlias("LoginID") // toXML时，标签别名首字母大写
	private String loginID;

	@ApiModelProperty(required = true)
	@XStreamAlias("LastName")
	private String lastName;

	@XStreamAlias("UserId")
	private String userId;

	@ApiModelProperty(required = true)
	@XStreamAlias("EMail")
	private String eMail;

	@ApiModelProperty(required = true)
	@XStreamAlias("Password")
	private String password;

	@ApiModelProperty(required = true)
	@XStreamAlias("TimeZoneId")
	private String timeZoneId;

	@ApiModelProperty(required = true)
	@XStreamAlias("UserProfileId")
	private Integer userProfileId;

	@ApiModelProperty(required = true)
	@XStreamAlias("Schedulable")
	private boolean schedulable;

	@ApiModelProperty(required = false, value = "Number")
	@XStreamAlias("MemberId")
	private String memberId;

	@ApiModelProperty(required = false)
	@XStreamAlias("FirstName")
	private String firstName;

	@ApiModelProperty(required = false)
	@XStreamAlias("TelephoneOffice")
	private String telephoneOffice;

	@ApiModelProperty(required = false)
	@XStreamAlias("TelephoneMobile")
	private String telephoneMobile;

	@ApiModelProperty(required = false)
	@XStreamAlias("DefaultTerminalId")
	private String defaultTerminalId;

	@ApiModelProperty(required = false)
	@XStreamAlias("LocationId")
	private String locationId;

	@ApiModelProperty(required = false)
	@XStreamAlias("Reservable")
	private String reservable;

	@ApiModelProperty(required = false)
	@XStreamAlias("AllowStreaming")
	private AllowStreaming allowStreaming;

	@ApiModelProperty(required = false)
	@XStreamAlias("AllowRecording")
	private AllowRecording allowRecording;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("DefaultMeetingTypeId")
	private String defaultMeetingTypeId;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("DefaultVirtualRoomId")
	private String defaultVirtualRoomId;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("MaxBandwidth")
	private String maxBandwidth;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("SipUri")
	private String sipUri;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("RecordingProfileId")
	private String recordingProfileId;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("ViewAllMeetingsByUserPortal")
	private boolean viewAllMeetingsByUserPortal;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("CanScheduleEventConference")
	private boolean canScheduleEventConference;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("AllowModerateWithoutPin")
	private boolean allowModerateWithoutPin;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("VoicePromptLanguage")
	private String voicePromptLanguage;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("AllowRandomMeetingID")
	private boolean allowRandomMeetingID;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("NamedUser")
	private boolean namedUser;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("AllowUseOthersVirtualroom")
	private boolean allowUseOthersVirtualroom;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("LocalUser")
	private boolean localUser;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("VirtualRoom")
	private VirtualRoom virtualRoom;

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTimeZoneId() {
		return timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public Integer getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(Integer userProfileId) {
		this.userProfileId = userProfileId;
	}

	public boolean isSchedulable() {
		return schedulable;
	}

	public void setSchedulable(boolean schedulable) {
		this.schedulable = schedulable;
	}

	public String getDefaultMeetingTypeId() {
		return defaultMeetingTypeId;
	}

	public void setDefaultMeetingTypeId(String defaultMeetingTypeId) {
		this.defaultMeetingTypeId = defaultMeetingTypeId;
	}

	public String getDefaultVirtualRoomId() {
		return defaultVirtualRoomId;
	}

	public void setDefaultVirtualRoomId(String defaultVirtualRoomId) {
		this.defaultVirtualRoomId = defaultVirtualRoomId;
	}

	public String getMaxBandwidth() {
		return maxBandwidth;
	}

	public void setMaxBandwidth(String maxBandwidth) {
		this.maxBandwidth = maxBandwidth;
	}

	public boolean isViewAllMeetingsByUserPortal() {
		return viewAllMeetingsByUserPortal;
	}

	public void setViewAllMeetingsByUserPortal(boolean viewAllMeetingsByUserPortal) {
		this.viewAllMeetingsByUserPortal = viewAllMeetingsByUserPortal;
	}

	public boolean isCanScheduleEventConference() {
		return canScheduleEventConference;
	}

	public void setCanScheduleEventConference(boolean canScheduleEventConference) {
		this.canScheduleEventConference = canScheduleEventConference;
	}

	public boolean isAllowModerateWithoutPin() {
		return allowModerateWithoutPin;
	}

	public void setAllowModerateWithoutPin(boolean allowModerateWithoutPin) {
		this.allowModerateWithoutPin = allowModerateWithoutPin;
	}

	public String getVoicePromptLanguage() {
		return voicePromptLanguage;
	}

	public void setVoicePromptLanguage(String voicePromptLanguage) {
		this.voicePromptLanguage = voicePromptLanguage;
	}

	public boolean isAllowRandomMeetingID() {
		return allowRandomMeetingID;
	}

	public void setAllowRandomMeetingID(boolean allowRandomMeetingID) {
		this.allowRandomMeetingID = allowRandomMeetingID;
	}

	public boolean isNamedUser() {
		return namedUser;
	}

	public void setNamedUser(boolean namedUser) {
		this.namedUser = namedUser;
	}

	public boolean isAllowUseOthersVirtualroom() {
		return allowUseOthersVirtualroom;
	}

	public void setAllowUseOthersVirtualroom(boolean allowUseOthersVirtualroom) {
		this.allowUseOthersVirtualroom = allowUseOthersVirtualroom;
	}

	public boolean isLocalUser() {
		return localUser;
	}

	public void setLocalUser(boolean localUser) {
		this.localUser = localUser;
	}

	public AllowStreaming getAllowStreaming() {
		return allowStreaming;
	}

	public void setAllowStreaming(AllowStreaming allowStreaming) {
		this.allowStreaming = allowStreaming;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public AllowRecording getAllowRecording() {
		return allowRecording;
	}

	public void setAllowRecording(AllowRecording allowRecording) {
		this.allowRecording = allowRecording;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getTelephoneMobile() {
		return telephoneMobile;
	}

	public void setTelephoneMobile(String telephoneMobile) {
		this.telephoneMobile = telephoneMobile;
	}

	public String getReservable() {
		return reservable;
	}

	public void setReservable(String reservable) {
		this.reservable = reservable;
	}

	public String getDefaultTerminalId() {
		return defaultTerminalId;
	}

	public void setDefaultTerminalId(String defaultTerminalId) {
		this.defaultTerminalId = defaultTerminalId;
	}

	public String getTelephoneOffice() {
		return telephoneOffice;
	}

	public void setTelephoneOffice(String telephoneOffice) {
		this.telephoneOffice = telephoneOffice;
	}

	public VirtualRoom getVirtualRoom() {
		return virtualRoom;
	}

	public void setVirtualRoom(VirtualRoom virtualRoom) {
		this.virtualRoom = virtualRoom;
	}

	public String getSipUri() {
		return sipUri;
	}

	public void setSipUri(String sipUri) {
		this.sipUri = sipUri;
	}

	public String getRecordingProfileId() {
		return recordingProfileId;
	}

	public void setRecordingProfileId(String recordingProfileId) {
		this.recordingProfileId = recordingProfileId;
	}

}
