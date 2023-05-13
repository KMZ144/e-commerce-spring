package com.global.store.user.mapper;

import org.mapstruct.Mapper;

import com.global.store.base.mapper.BaseMapper;
import com.global.store.user.dto.UserDto;
import com.global.store.user.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User, UserDto> {
	

}
