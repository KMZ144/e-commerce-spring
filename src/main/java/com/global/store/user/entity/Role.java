package com.global.store.user.entity;


import com.global.store.base.entity.BaseEntity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Role extends BaseEntity<Long> {
	
	private String name;
	
	
}
