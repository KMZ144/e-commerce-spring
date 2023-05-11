package com.global.store.base.dto;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseDto<ID extends Number> {
	
	private ID Id;


}
