package com.global.store.orderMangement.repo;

import org.springframework.stereotype.Repository;

import com.global.store.base.repo.BaseRepo;
import com.global.store.orderMangement.entity.Orders;


@Repository
public interface OrdersRepo extends BaseRepo<Orders, Long> {

	
}
