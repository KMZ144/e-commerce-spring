package com.global.store.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.global.store.user.dto.RoleDto;
import com.global.store.user.service.RoleService;
import com.global.store.user.mapper.RoleMapper;




@RestController
@RequestMapping("/api/v1/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private RoleMapper roleMapper;
	
	@GetMapping("")
	ResponseEntity<Iterable<RoleDto>> findAll(){
		Iterable<RoleDto> roleDtos = roleMapper.map(roleService.findAll());  
		return  ResponseEntity.ok(roleDtos);
	}

}
