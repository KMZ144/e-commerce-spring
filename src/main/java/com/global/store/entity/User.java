package com.global.store.entity;

import com.global.store.base.entity.BaseEntity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class User extends BaseEntity<Long> {
	
	private String name;
	
	private String email;
	
	private String address;
	
	private String phone;
	
	private String Password;

}
