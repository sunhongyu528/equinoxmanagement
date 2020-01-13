package com.changhongit.equinoxmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.changhongit.equinoxmanagement.bean.Conference;
import com.changhongit.equinoxmanagement.bean.Criteria;
import com.changhongit.equinoxmanagement.bean.Entry;
import com.changhongit.equinoxmanagement.request.Cancel_Conference_Request;
import com.changhongit.equinoxmanagement.request.Get_Conference_Request;
import com.changhongit.equinoxmanagement.request.Modify_Conference_Request;
import com.changhongit.equinoxmanagement.request.Schedule_Conference_Request;
import com.changhongit.equinoxmanagement.response.BaseResponse;
import com.changhongit.equinoxmanagement.response.Cancel_Conference_Response;
import com.changhongit.equinoxmanagement.response.Get_Conference_Response;
import com.changhongit.equinoxmanagement.response.Modify_Conference_Response;
import com.changhongit.equinoxmanagement.response.Schedule_Conference_Response;
import com.changhongit.equinoxmanagement.service.XmlService;

import io.swagger.annotations.Api;

@Api(value = "ConferenceController", description = "Conference API")
@RestController
public class ConferenceController {

	@Autowired
	XmlService xmlService;

	@RequestMapping(value = "/conference", method = RequestMethod.POST)
	public BaseResponse scheduleConference(@RequestBody Conference conference, HttpServletRequest request) {
		Schedule_Conference_Request confRequest = new Schedule_Conference_Request(1, conference);
		return xmlService.sendRequest(confRequest, new Schedule_Conference_Response());
	}

	@RequestMapping(value = "/conference/{conferenceId}", method = RequestMethod.GET)
	public BaseResponse getConference(@PathVariable("conferenceId") String conferenceId, HttpServletRequest request) {
		Get_Conference_Request confRequest = new Get_Conference_Request(1, conferenceId);
		return xmlService.sendRequest(confRequest, new Get_Conference_Response());
	}

	@RequestMapping(value = "/conferenceList", method = RequestMethod.GET)
	public BaseResponse searchConference(@RequestParam(name = "userId") String userId,
			@RequestParam(name = "startTime") String startTime, @RequestParam(name = "endTime") String endTime,
			HttpServletRequest request) {
		Criteria criteria = new Criteria();
		List<Entry> entryList = new ArrayList<Entry>();

		entryList.add(new Entry("StartTime", startTime));
		entryList.add(new Entry("EndTime", endTime));
		criteria.setEntry(entryList);
		Get_Conference_Request confRequest = new Get_Conference_Request(1, criteria);

		Get_Conference_Response response = (Get_Conference_Response) xmlService.sendRequest(confRequest,
				new Get_Conference_Response());
		response.filterConference(userId);

		return response;
	}

	@RequestMapping(value = "/conference", method = RequestMethod.PUT)
	public BaseResponse modifyConference(@RequestBody Conference conference, HttpServletRequest request) {
		Modify_Conference_Request modify_Conference_Request = new Modify_Conference_Request(1, conference);
		return xmlService.sendRequest(modify_Conference_Request, new Modify_Conference_Response());
	}

	@RequestMapping(value = "/conference/{conferenceId}", method = RequestMethod.DELETE)
	public BaseResponse cancelConference(@PathVariable("conferenceId") Long conferenceId, HttpServletRequest request) {
		Cancel_Conference_Request cancel_Conference_Request = new Cancel_Conference_Request(1, conferenceId);
		return xmlService.sendRequest(cancel_Conference_Request, new Cancel_Conference_Response());
	}

}
