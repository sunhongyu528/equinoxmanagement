package com.changhongit.equinoxmanagement.config;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.changhongit.equinoxmanagement.bean.SimpleUser;
import com.changhongit.equinoxmanagement.bean.User;
import com.changhongit.equinoxmanagement.request.Get_User_Request;
import com.changhongit.equinoxmanagement.response.Get_User_Response;
import com.changhongit.equinoxmanagement.service.XmlService;

@Component
public class UserMap {
	@Autowired
	XmlService xmlService;

	private Map<String, User> userMap = new HashMap<String, User>();

	private Date lastTime = new Date();

	public void getAllUsers() {
		Get_User_Request get_User_Request = new Get_User_Request(2);
		Get_User_Response response = (Get_User_Response) xmlService.sendRequest(get_User_Request,
				new Get_User_Response());
		addUsers(response.getUser());
		System.out.println("user count: " + userMap.size());
	}

	public void addUsers(List<User> users) {
		for (User user : users) {
			if (!userMap.containsKey(user.getLoginID())) {
				userMap.put(user.getLoginID(), user);
			}
		}
	}

	public List<SimpleUser> getUserList(String loginIdCondition) {
		Date currentTime = new Date();
		long m = currentTime.getTime() - lastTime.getTime();
		System.out.println("time minisecond: " + m);
		if (m > 60000 || userMap.size() == 0) {
			getAllUsers();
			lastTime = currentTime;
			System.out.println("UserMap--getAllUsers " + currentTime);
		}
		List<SimpleUser> simpleUsers = new ArrayList<SimpleUser>();
		if (StringUtils.isNotEmpty(loginIdCondition)) {
			List<Entry<String, User>> entryList = userMap.entrySet().stream()
					.filter(a -> a.getKey().contains(loginIdCondition)).collect(Collectors.toList());
			for (Entry<String, User> entry : entryList) {
				User user = entry.getValue();
				SimpleUser simpleUser = new SimpleUser(user.getLoginID(), user.getFirstName(), user.getLastName(),
						user.getUserId(), user.geteMail());
				simpleUsers.add(simpleUser);
			}
		} else {
			for (Entry<String, User> entry : userMap.entrySet()) {
				User user = entry.getValue();
				SimpleUser simpleUser = new SimpleUser(user.getLoginID(), user.getFirstName(), user.getLastName(),
						user.getUserId(), user.geteMail());
				simpleUsers.add(simpleUser);
			}
		}
		return simpleUsers;
	}

}
