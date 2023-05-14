package com.global.store.catalogMangement.entity;

import com.global.store.base.entity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseEntity<Long>  {

	private String name;
	
	private double price;
	
	private double quantity;
	
	private String imgUrl; 
	
	@ManyToOne()
	private Category category;
	
	
}
