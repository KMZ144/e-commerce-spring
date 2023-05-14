package com.global.store.catalogMangement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.global.store.catalogMangement.dto.CategoryDto;
import com.global.store.catalogMangement.mapper.CategoryMapper;
import com.global.store.catalogMangement.service.CategoryService;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private CategoryMapper categoryMapper;
	
	@GetMapping("")
	ResponseEntity<Iterable<CategoryDto>> findAll(){
		Iterable<CategoryDto> categoryDtos = categoryMapper.map(categoryService.findAll());  
		return  ResponseEntity.ok(categoryDtos);
	}

}
