package com.global.store.base.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.global.store.base.entity.BaseEntity;
import com.global.store.base.repo.BaseRepo;

import jakarta.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class BaseService <T extends BaseEntity<ID>,ID extends Number>  {
	
	@Autowired
	private  BaseRepo<T, ID> baseRepo;
	
	public Iterable<T> findAll() {
		return baseRepo.findAll();
	}
	
	public Optional<T> findById(ID id) {
		Optional<T> entity=baseRepo.findById(id);
			return entity ;
	}
	
	
	public T insert(T entity) {
		return baseRepo.save(entity);
	}
	
	public T update(T entity) {
		return baseRepo.save(entity);
	}
	
	public void deleteById(ID id) {
		 baseRepo.deleteById(id);
	}

}
