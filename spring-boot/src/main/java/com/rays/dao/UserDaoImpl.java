package com.rays.dao;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDaoImpl;
import com.rays.dto.UserDto;

@Repository
public class UserDaoImpl extends BaseDaoImpl<UserDto> implements UserDaoInt{

	
	public Class<UserDto> getDTOClass() {
		return UserDto.class;
	}

}
