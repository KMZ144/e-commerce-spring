package com.global.store.mapper;

import org.mapstruct.Mapper;

import com.global.store.base.mapper.BaseMapper;
import com.global.store.dto.UserDto;
import com.global.store.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User, UserDto> {
	

}
