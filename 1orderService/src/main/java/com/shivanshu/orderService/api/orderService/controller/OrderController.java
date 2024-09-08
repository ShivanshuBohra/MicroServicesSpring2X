package com.shivanshu.orderService.api.orderService.controller;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivanshu.orderService.api.orderService.dto.TransactionRequestDto;
import com.shivanshu.orderService.api.orderService.dto.TransactionResponseDto;
import com.shivanshu.orderService.api.orderService.entity.Order;
import com.shivanshu.orderService.api.orderService.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;

	
	@PostMapping("/bookOrder")
	public TransactionResponseDto bookOrder(@RequestBody TransactionRequestDto transactionRequestDto ) {
		// to fetch Environment variable
		System.out.println(System.getenv("DB_PASSWORD"));
		
		return orderService.saveOrder(transactionRequestDto);
	}
}
