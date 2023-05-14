package com.global.store.catalogMangement.mapper;

import org.mapstruct.Mapper;

import com.global.store.base.mapper.BaseMapper;
import com.global.store.catalogMangement.dto.ProductDto;
import com.global.store.catalogMangement.entity.Product;

@Mapper(uses = CategoryMapper.class)
public interface ProductMapper extends BaseMapper<Product, ProductDto> {

}
