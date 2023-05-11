package com.global.store.base.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.global.store.base.entity.BaseEntity;

@NoRepositoryBean
public interface BaseRepo<T extends BaseEntity<ID>,ID extends Number> extends JpaRepository<T, ID> {
	
	
	
	

}
