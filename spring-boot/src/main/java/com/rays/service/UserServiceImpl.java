package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.UserDaoInt;
import com.rays.dto.UserDto;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<UserDto, UserDaoInt> implements UserServiceInt{

}