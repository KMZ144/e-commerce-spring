package com.global.store.user.dto;

import com.global.store.base.dto.BaseDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto extends BaseDto<Long> {
	
	private String name;
	
	private String email;
	
	private String address;
	
	private String phone;
	

}
