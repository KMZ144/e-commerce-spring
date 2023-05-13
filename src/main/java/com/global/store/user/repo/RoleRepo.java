package com.global.store.user.repo;

import org.springframework.stereotype.Repository;

import com.global.store.base.repo.BaseRepo;
import com.global.store.user.entity.Role;
import com.global.store.user.entity.User;


@Repository
public interface RoleRepo extends BaseRepo<Role, Long> {

	Role findByName (String name);
}
