package com.shivanshu.orderService.api.paymentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivanshu.orderService.api.paymentService.entity.Payment;

public interface PaymentReposity extends JpaRepository<Payment, Integer>{

}
