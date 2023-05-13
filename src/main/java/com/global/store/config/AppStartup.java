package com.global.store.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.global.store.user.entity.Role;
import com.global.store.user.entity.User;
import com.global.store.user.service.RoleService;
import com.global.store.user.service.UserService;

@Component
public class AppStartup implements CommandLineRunner {

	@Autowired
	UserService userService;
	
	@Autowired
	RoleService roleService;
	@Override
	public void run(String... args) throws Exception {
		
		addRoleDemoData();
		addUserDemoData();
		
	}
	
	private void addUserDemoData () {
		if (userService.findAll().isEmpty()) {
			userService.insert(new User("cairo", "ahmed@gmail", "ahmed", "123456", "01026842",Arrays.asList(roleService.findByName("admin"))));
			userService.insert(new User("alex", "ali@gmail", "ali", "1234587", "010265774",Arrays.asList(roleService.findByName("user"))));
		}
	}
	
	private void addRoleDemoData () {
		if (roleService.findAll().isEmpty()) {
			roleService.insert(new Role("admin"));
			roleService.insert(new Role("user"));
		}
	}

}
