package com.global.store.user.mapper;

import org.mapstruct.Mapper;

import com.global.store.base.mapper.BaseMapper;
import com.global.store.user.dto.RoleDto;
import com.global.store.user.entity.Role;

@Mapper
public interface RoleMapper extends BaseMapper<Role, RoleDto> {
	

}
