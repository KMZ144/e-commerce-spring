package com.global.store.orderMangement.mapper;

import org.mapstruct.Mapper;

import com.global.store.base.mapper.BaseMapper;
import com.global.store.catalogMangement.dto.ProductDto;
import com.global.store.catalogMangement.mapper.ProductMapper;
import com.global.store.orderMangement.dto.OrdersDto;
import com.global.store.orderMangement.entity.Orders;

@Mapper (uses = ProductMapper.class)
public interface OrdersMapper extends BaseMapper<Orders, OrdersDto> {

	
}
