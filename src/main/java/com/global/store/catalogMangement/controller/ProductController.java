package com.global.store.catalogMangement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.global.store.catalogMangement.dto.ProductDto;
import com.global.store.catalogMangement.mapper.ProductMapper;
import com.global.store.catalogMangement.service.ProductService;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductMapper productMapper;
	
	@GetMapping("")
	ResponseEntity<Iterable<ProductDto>> findAll(){
		Iterable<ProductDto> productDtos = productMapper.map(productService.findAll());  
		return  ResponseEntity.ok(productDtos);
	}

}
