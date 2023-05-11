package com.global.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.global.store.dto.UserDto;
import com.global.store.mapper.UserMapper;
import com.global.store.service.UserService;


@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserMapper userMapper;
	
	@GetMapping("")
	ResponseEntity<Iterable<UserDto>> findAll(){
		Iterable<UserDto> userDtos = userMapper.map(userService.findAll());  
		return  ResponseEntity.ok(userDtos);
	}

}
