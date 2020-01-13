package com.changhongit.equinoxmanagement.bean;

import java.util.List;

import com.changhongit.equinoxmanagement.enums.AllowStreaming;
import com.changhongit.equinoxmanagement.enums.Priority;
import com.changhongit.equinoxmanagement.enums.Status;
import com.changhongit.equinoxmanagement.enums.StreamingStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import io.swagger.annotations.ApiModelProperty;

@XStreamAlias("Conference")
public class Conference {

	@XStreamAlias("MemberId")
	private String memberId;

	@ApiModelProperty(required = true, value = "Number")
	@XStreamAlias("UserId")
	private String userId;

	@XStreamAlias("Number")
	private String number;

	@ApiModelProperty(required = true)
	@XStreamAlias("AccessPIN")
	private String accessPIN;

	@ApiModelProperty(required = true)
	@XStreamAlias("ModeratorPIN")
	private String moderatorPIN;

	@ApiModelProperty(required = true)
	@XStreamAlias("ServiceTemplateId")
	private String serviceTemplateId;

	@ApiModelProperty(required = true)
	@XStreamAlias("ServicePrefix")
	private String servicePrefix;

	@XStreamAlias("Priority")
	private Priority priority;

	@XStreamAlias("AllowStreaming")
	private AllowStreaming allowStreaming;

	@XStreamAlias("StreamingStatus")
	private StreamingStatus streamingStatus;

	@XStreamImplicit(itemFieldName = "Attendee")
	@XStreamAlias("Attendee")
	private List<Attendee> attendee;

	@XStreamAlias("ReservedPorts")
	private ReservedPorts reservedPorts;

	@ApiModelProperty(required = true)
	@XStreamAlias("BlockDialIn")
	private boolean blockDialIn;

	@JsonInclude(Include.NON_ABSENT)
	@ApiModelProperty(required = true)
	@XStreamAlias("AutoExtend")
	private boolean autoExtend;

	@ApiModelProperty(required = true)
	@XStreamAlias("WaitingRoom")
	private boolean waitingRoom;

	@XStreamAlias("AdvancedProperties")
	private AdvancedProperties advancedProperties;

	@XStreamAlias("OneTimePINRequired")
	private boolean oneTimePINRequired;

	@XStreamAlias("Status")
	private Status status;

	@ApiModelProperty(required = true)
	@XStreamAlias("Subject")
	private String subject;

	@ApiModelProperty(required = true)
	@XStreamAlias("Description")
	private String description;

	@ApiModelProperty(required = true, value = "UTC time: YYYY-MM-DDThh:mm:ss+hh:mm")
	@XStreamAlias("StartTime")
	private String startTime;

	@ApiModelProperty(required = true)
	@XStreamAlias("TimeZoneId")
	private String timeZoneId;

	@ApiModelProperty(required = true)
	@XStreamAlias("Duration")
	private String duration;

	@XStreamAlias("LocationId")
	private String locationId;

//	@XStreamAlias("TestOnly")
//	private boolean testOnly;

	@XStreamAlias("SendingNotification")
	private boolean sendingNotification;

	@XStreamAlias("RecordingMeetingWhenStart")
	private boolean recordingMeetingWhenStart;

	@XStreamAlias("Daily")
	private Daily daily;

	@XStreamAlias("Weekly")
	private Weekly weekly;

	@XStreamAlias("Monthly")
	private Monthly monthly;

	@XStreamAlias("RecurrenceEnd")
	private RecurrenceEnd recurrenceEnd;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("ConferenceId")
	private String conferenceId;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("Layout")
	@XStreamImplicit(itemFieldName = "Layout")
	private List<Layout> layout;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("EarlyTime")
	private String earlyTime;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("EventConference")
	private boolean eventConference;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("PlannedEndTime")
	private String plannedEndTime;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("ReccurencePatternChanged")
	private boolean reccurencePatternChanged;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("RecipentsChanged")
	private boolean recipentsChanged;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("AddRecipents")
	private boolean addRecipents;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("RemovePersonalTerminals")
	private boolean removePersonalTerminals;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("CheckTerminalConflicts")
	private boolean checkTerminalConflicts;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("CSRSetting")
	private CSRSetting cSRSetting;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("UserFirstName")
	private String userFirstName;

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("UserLastName")
	private String userLastName;
	

	@ApiModelProperty(required = false, hidden = true)
	@XStreamAlias("RecordingStatus")
	private String recordingStatus;

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

	public boolean isWaitingRoom() {
		return waitingRoom;
	}

	public void setWaitingRoom(boolean waitingRoom) {
		this.waitingRoom = waitingRoom;
	}

	public AdvancedProperties getAdvancedProperties() {
		return advancedProperties;
	}

	public void setAdvancedProperties(AdvancedProperties advancedProperties) {
		this.advancedProperties = advancedProperties;
	}

	public boolean isOneTimePINRequired() {
		return oneTimePINRequired;
	}

	public void setOneTimePINRequired(boolean oneTimePINRequired) {
		this.oneTimePINRequired = oneTimePINRequired;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTimeZoneId() {
		return timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
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

	public String getConferenceId() {
		return conferenceId;
	}

	public void setConferenceId(String conferenceId) {
		this.conferenceId = conferenceId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

//	public boolean isTestOnly() {
//		return testOnly;
//	}
//
//	public void setTestOnly(boolean testOnly) {
//		this.testOnly = testOnly;
//	}

	public boolean isSendingNotification() {
		return sendingNotification;
	}

	public void setSendingNotification(boolean sendingNotification) {
		this.sendingNotification = sendingNotification;
	}

	public boolean isRecordingMeetingWhenStart() {
		return recordingMeetingWhenStart;
	}

	public void setRecordingMeetingWhenStart(boolean recordingMeetingWhenStart) {
		this.recordingMeetingWhenStart = recordingMeetingWhenStart;
	}

	public Daily getDaily() {
		return daily;
	}

	public void setDaily(Daily daily) {
		this.daily = daily;
	}

	public Weekly getWeekly() {
		return weekly;
	}

	public void setWeekly(Weekly weekly) {
		this.weekly = weekly;
	}

	public Monthly getMonthly() {
		return monthly;
	}

	public void setMonthly(Monthly monthly) {
		this.monthly = monthly;
	}

	public RecurrenceEnd getRecurrenceEnd() {
		return recurrenceEnd;
	}

	public void setRecurrenceEnd(RecurrenceEnd recurrenceEnd) {
		this.recurrenceEnd = recurrenceEnd;
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

	public List<Layout> getLayout() {
		return layout;
	}

	public void setLayout(List<Layout> layout) {
		this.layout = layout;
	}

	public String getEarlyTime() {
		return earlyTime;
	}

	public void setEarlyTime(String earlyTime) {
		this.earlyTime = earlyTime;
	}

	public boolean isEventConference() {
		return eventConference;
	}

	public void setEventConference(boolean eventConference) {
		this.eventConference = eventConference;
	}

	public String getPlannedEndTime() {
		return plannedEndTime;
	}

	public void setPlannedEndTime(String plannedEndTime) {
		this.plannedEndTime = plannedEndTime;
	}

	public boolean isReccurencePatternChanged() {
		return reccurencePatternChanged;
	}

	public void setReccurencePatternChanged(boolean reccurencePatternChanged) {
		this.reccurencePatternChanged = reccurencePatternChanged;
	}

	public boolean isRecipentsChanged() {
		return recipentsChanged;
	}

	public void setRecipentsChanged(boolean recipentsChanged) {
		this.recipentsChanged = recipentsChanged;
	}

	public boolean isAddRecipents() {
		return addRecipents;
	}

	public void setAddRecipents(boolean addRecipents) {
		this.addRecipents = addRecipents;
	}

	public boolean isRemovePersonalTerminals() {
		return removePersonalTerminals;
	}

	public void setRemovePersonalTerminals(boolean removePersonalTerminals) {
		this.removePersonalTerminals = removePersonalTerminals;
	}

	public boolean isCheckTerminalConflicts() {
		return checkTerminalConflicts;
	}

	public void setCheckTerminalConflicts(boolean checkTerminalConflicts) {
		this.checkTerminalConflicts = checkTerminalConflicts;
	}

	public CSRSetting getcSRSetting() {
		return cSRSetting;
	}

	public void setcSRSetting(CSRSetting cSRSetting) {
		this.cSRSetting = cSRSetting;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getRecordingStatus() {
		return recordingStatus;
	}

	public void setRecordingStatus(String recordingStatus) {
		this.recordingStatus = recordingStatus;
	}

}
