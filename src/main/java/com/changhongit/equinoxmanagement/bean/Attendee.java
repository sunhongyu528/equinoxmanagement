package com.changhongit.equinoxmanagement.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.changhongit.equinoxmanagement.enums.Protocol;

@XStreamAlias("Attendee")
public class Attendee {

	@XStreamAlias("TerminalId")
	private String TerminalId;

	@XStreamAlias("Protocol")
	private Protocol Protocol;

	@XStreamAlias("TerminalName")
	private String TerminalName;

	@XStreamAlias("TerminalNumber")
	private String TerminalNumber;

	@XStreamAlias("MaxBandwidth")
	private String MaxBandwidth;

	@XStreamAlias("MaxISDNBandwidth")
	private String MaxISDNBandwidth;

	@XStreamAlias("AreaCode")
	private String AreaCode;

	@XStreamAlias("CountryCode")
	private String CountryCode;

	@XStreamAlias("TelephoneNumber")
	private String TelephoneNumber;

	@XStreamAlias("RestrictedMode")
	private String RestrictedMode;

	@XStreamAlias("ThreeG")
	private boolean ThreeG;

	@XStreamAlias("VoiceOnly")
	private boolean VoiceOnly;

	@XStreamAlias("UserId")
	private String UserId;

	@XStreamAlias("FirstName")
	private String FirstName;

	@XStreamAlias("LastName")
	private String LastName;

	@XStreamAlias("Email")
	private String Email;

	@XStreamAlias("Organizer")
	private boolean Organizer;

	@XStreamAlias("Host")
	private boolean Host;

	@XStreamAlias("DialIn")
	private boolean dialIn;

	@XStreamAlias("NeedOnMaster")
	private boolean needOnMaster;

	@XStreamAlias("Organizer")
	private boolean organizer;

	@XStreamAlias("Panelist")
	private boolean panelist;

	@XStreamAlias("MemberId")
	private String memberId;

	@XStreamAlias("Description")
	private String description;

	@XStreamAlias("VideoProfile")
	private String videoProfile;

	@XStreamAlias("LocationId")
	private String locationId;

	@XStreamAlias("AddressBookEnabled")
	private boolean addressBookEnabled;

	public String getTerminalId() {
		return TerminalId;
	}

	public void setTerminalId(String terminalId) {
		TerminalId = terminalId;
	}

	public boolean isThreeG() {
		return ThreeG;
	}

	public void setThreeG(boolean threeG) {
		ThreeG = threeG;
	}

	public boolean isVoiceOnly() {
		return VoiceOnly;
	}

	public void setVoiceOnly(boolean voiceOnly) {
		VoiceOnly = voiceOnly;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public boolean isOrganizer() {
		return Organizer;
	}

	public void setOrganizer(boolean organizer) {
		Organizer = organizer;
	}

	public boolean isHost() {
		return Host;
	}

	public void setHost(boolean host) {
		Host = host;
	}

	public boolean isDialIn() {
		return dialIn;
	}

	public void setDialIn(boolean dialIn) {
		this.dialIn = dialIn;
	}

	public boolean isNeedOnMaster() {
		return needOnMaster;
	}

	public void setNeedOnMaster(boolean needOnMaster) {
		this.needOnMaster = needOnMaster;
	}

	public boolean isPanelist() {
		return panelist;
	}

	public void setPanelist(boolean panelist) {
		this.panelist = panelist;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVideoProfile() {
		return videoProfile;
	}

	public void setVideoProfile(String videoProfile) {
		this.videoProfile = videoProfile;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public boolean isAddressBookEnabled() {
		return addressBookEnabled;
	}

	public void setAddressBookEnabled(boolean addressBookEnabled) {
		this.addressBookEnabled = addressBookEnabled;
	}

	public Protocol getProtocol() {
		return Protocol;
	}

	public void setProtocol(Protocol protocol) {
		Protocol = protocol;
	}

	public String getTerminalName() {
		return TerminalName;
	}

	public void setTerminalName(String terminalName) {
		TerminalName = terminalName;
	}

	public String getTerminalNumber() {
		return TerminalNumber;
	}

	public void setTerminalNumber(String terminalNumber) {
		TerminalNumber = terminalNumber;
	}

	public String getMaxBandwidth() {
		return MaxBandwidth;
	}

	public void setMaxBandwidth(String maxBandwidth) {
		MaxBandwidth = maxBandwidth;
	}

	public String getMaxISDNBandwidth() {
		return MaxISDNBandwidth;
	}

	public void setMaxISDNBandwidth(String maxISDNBandwidth) {
		MaxISDNBandwidth = maxISDNBandwidth;
	}

	public String getAreaCode() {
		return AreaCode;
	}

	public void setAreaCode(String areaCode) {
		AreaCode = areaCode;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}

	public String getTelephoneNumber() {
		return TelephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		TelephoneNumber = telephoneNumber;
	}

	public String getRestrictedMode() {
		return RestrictedMode;
	}

	public void setRestrictedMode(String restrictedMode) {
		RestrictedMode = restrictedMode;
	}

}
