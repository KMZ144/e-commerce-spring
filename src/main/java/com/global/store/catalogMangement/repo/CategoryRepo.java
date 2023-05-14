package com.global.store.catalogMangement.repo;

import org.springframework.stereotype.Repository;

import com.global.store.base.repo.BaseRepo;
import com.global.store.catalogMangement.entity.Category;

@Repository
public interface CategoryRepo extends BaseRepo<Category, Long> {

}
