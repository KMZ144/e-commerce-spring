package com.global.store.orderMangement.dto;

import java.util.List;

import com.global.store.base.dto.BaseDto;
import com.global.store.catalogMangement.entity.Product;

import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrdersDto extends BaseDto<Long>  {

private long quantity;
	
	
	private List<Product> products;
	
}
