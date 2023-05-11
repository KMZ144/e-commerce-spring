package com.global.store.base.mapper;

public interface BaseMapper <T,DTO> {
	
	DTO map (T entity);
	T unmap (DTO entity);
	Iterable<DTO> map (Iterable<T> entities );
	Iterable<T> unmap (Iterable<DTO> DTOs );
	
}
