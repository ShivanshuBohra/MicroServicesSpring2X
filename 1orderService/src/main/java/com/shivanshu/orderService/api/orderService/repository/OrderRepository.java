package com.shivanshu.orderService.api.orderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivanshu.orderService.api.orderService.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
