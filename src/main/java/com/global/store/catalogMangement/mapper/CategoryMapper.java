package com.global.store.catalogMangement.mapper;

import org.mapstruct.Mapper;

import com.global.store.base.mapper.BaseMapper;
import com.global.store.catalogMangement.dto.CategoryDto;
import com.global.store.catalogMangement.entity.Category;

@Mapper
public interface CategoryMapper extends BaseMapper<Category, CategoryDto> {

}
