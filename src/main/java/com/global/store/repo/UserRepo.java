package com.global.store.repo;

import org.springframework.stereotype.Repository;

import com.global.store.base.repo.BaseRepo;
import com.global.store.entity.User;


@Repository
public interface UserRepo extends BaseRepo<User, Long> {

	
}
