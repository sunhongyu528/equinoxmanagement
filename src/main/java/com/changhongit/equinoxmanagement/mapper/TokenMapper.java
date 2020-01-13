package com.changhongit.equinoxmanagement.mapper;

import org.mapstruct.Mapper;

import com.changhongit.equinoxmanagement.bean.AccessToken;

@Mapper
public interface TokenMapper {
	void addToken(AccessToken token);

	void updataToken(AccessToken token);

	AccessToken findByUserId(int userid);
}
