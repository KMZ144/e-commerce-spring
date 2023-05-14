package com.global.store.orderMangement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import com.global.store.base.entity.BaseEntity;
import com.global.store.catalogMangement.entity.Product;

@Setter
@Getter
@Entity
public class Orders extends BaseEntity<Long> {
	
	private long quantity;
	
	@ManyToMany()
	private List<Product> products;
	
	

}
