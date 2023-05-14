package com.global.store.catalogMangement.dto;

import com.global.store.base.dto.BaseDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDto extends BaseDto<Long> {

	private String name;

}
