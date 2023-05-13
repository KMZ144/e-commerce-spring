package com.global.store.user.entity;

import java.util.ArrayList;

import java.util.List;

import com.global.store.base.entity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity<Long> {
	
	private String name;
	
	private String email;
	
	private String address;
	
	private String phone;
	
	private String Password;
	
	@ManyToMany
	@JoinTable(name="users_roles",
	joinColumns=@JoinColumn(name="user_id"),
	inverseJoinColumns = @JoinColumn(name="role_id") )
	private List<Role> roles = new ArrayList();


}
