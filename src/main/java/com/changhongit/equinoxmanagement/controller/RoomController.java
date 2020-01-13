package com.changhongit.equinoxmanagement.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.changhongit.equinoxmanagement.bean.VirtualRoom;
import com.changhongit.equinoxmanagement.request.Create_Virtual_Room_Request;
import com.changhongit.equinoxmanagement.request.Delete_Virtual_Room_Request;
import com.changhongit.equinoxmanagement.request.Get_Virtual_Room_Request;
import com.changhongit.equinoxmanagement.request.Modify_Virtual_Room_Request;
import com.changhongit.equinoxmanagement.response.BaseResponse;
import com.changhongit.equinoxmanagement.response.Create_Virtual_Room_Response;
import com.changhongit.equinoxmanagement.response.Delete_Virtual_Room_Response;
import com.changhongit.equinoxmanagement.response.Get_Virtual_Room_Response;
import com.changhongit.equinoxmanagement.response.Modify_Virtual_Room_Response;
import com.changhongit.equinoxmanagement.service.XmlService;

import io.swagger.annotations.Api;

@Api(value = "RoomController", description = "VirtualRoom API")
@RestController
public class RoomController {
	@Autowired
	XmlService xmlService;

	@RequestMapping(value = "/room", method = RequestMethod.POST)
	public BaseResponse createRoom(@RequestBody VirtualRoom virtualRoom, HttpServletRequest request) {
		Create_Virtual_Room_Request create_Virtual_Room_Request = new Create_Virtual_Room_Request(1, virtualRoom);
		Create_Virtual_Room_Response response = (Create_Virtual_Room_Response) xmlService
				.sendRequest(create_Virtual_Room_Request, new Create_Virtual_Room_Response());

		if (response.getReturnValue().equalsIgnoreCase("OK")) {
			Get_Virtual_Room_Request get_Virtual_Room_Request = new Get_Virtual_Room_Request();
			get_Virtual_Room_Request.setRequestID(1);
			get_Virtual_Room_Request.setVirtualRoomId(response.getVirtualRoomeId());
			return xmlService.sendRequest(get_Virtual_Room_Request, new Get_Virtual_Room_Response());
		} else {
			return response;
		}
	}

	@RequestMapping(value = "/room/get", method = RequestMethod.POST)
	public BaseResponse getRoom(@RequestBody Get_Virtual_Room_Request roomRequest, HttpServletRequest request) {
		return xmlService.sendRequest(roomRequest, new Get_Virtual_Room_Response());
	}

	@RequestMapping(value = "/room", method = RequestMethod.PUT)
	public BaseResponse modifyRoom(@RequestBody VirtualRoom virtualRoom, HttpServletRequest request) {
		Modify_Virtual_Room_Request modify_Virtual_Room_Request = new Modify_Virtual_Room_Request(1, virtualRoom);
		return xmlService.sendRequest(modify_Virtual_Room_Request, new Modify_Virtual_Room_Response());
	}

	@RequestMapping(value = "/room/{virtualRoomId}", method = RequestMethod.DELETE)
	public BaseResponse removeRoom(@PathVariable("virtualRoomId") String virtualRoomId, HttpServletRequest request) {

		Delete_Virtual_Room_Request roomRequest = new Delete_Virtual_Room_Request(1, virtualRoomId);
		return xmlService.sendRequest(roomRequest, new Delete_Virtual_Room_Response());
	}
}
