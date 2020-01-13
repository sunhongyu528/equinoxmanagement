package com.changhongit.equinoxmanagement.config;

import java.util.HashMap;
import java.util.Map;

import com.changhongit.equinoxmanagement.bean.AccessToken;

public class UserTokenMap {

	private static Map<String, AccessToken> userTokenMap = new HashMap<String, AccessToken>();

	public static void addToken(AccessToken token) {
		if (!userTokenMap.containsKey(token.getToken())) {
			userTokenMap.put(token.getToken(), token);
		}
	}

	public static void updataToken(String oldToken, AccessToken token) {
		if (userTokenMap.containsKey(oldToken)) {
			userTokenMap.remove(oldToken);
			userTokenMap.put(token.getToken(), token);
		}
	}

	public static AccessToken getToken(String tokenStr) {
		return userTokenMap.get(tokenStr);
	}

	public static AccessToken findByLoginId(String loginId) {
		return null;
	}

	public static void deleteToken(String loginId) {
		if (userTokenMap.containsKey(loginId)) {
			userTokenMap.remove(loginId);
		}
	}
}
