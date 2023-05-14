package com.global.store.orderMangement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.global.store.orderMangement.dto.OrdersDto;
import com.global.store.orderMangement.mapper.OrdersMapper;
import com.global.store.orderMangement.service.OrdersService;
import com.global.store.user.dto.RoleDto;

@RestController
@RequestMapping("api/v1/orders")
public class OrdersController {
	
	@Autowired
	private OrdersService ordersService;
	
	@Autowired
	private OrdersMapper ordersMapper;
	
	@GetMapping("")
	ResponseEntity<Iterable<OrdersDto>> findAll(){
		Iterable<OrdersDto> ordersDtos = ordersMapper.map(ordersService.findAll());  
		return  ResponseEntity.ok(ordersDtos);
	}

	

}
