package com.global.store.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.store.base.service.BaseService;
import com.global.store.user.entity.Role;
import com.global.store.user.repo.RoleRepo;

@Service
public class RoleService extends BaseService<Role, Long> {
	
	@Autowired
	RoleRepo roleRepo;
	public Role findByName(String name) {
		return roleRepo.findByName(name);
	}
	

}
