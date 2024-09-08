package com.shivanshu.orderService.api.orderService.dto;

import com.shivanshu.orderService.api.orderService.entity.Order;

public class TransactionResponseDto {

	private OrderDto orderDto;
	private double amount;
	private  String transactionId;
	private String message;
	
	
	
	public TransactionResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public TransactionResponseDto(OrderDto orderDto, double amount, String transactionId, String message) {
		super();
		this.orderDto = orderDto;
		this.amount = amount;
		this.transactionId = transactionId;
		this.message = message;
	}



	public OrderDto getOrderDto() {
		return orderDto;
	}



	public void setOrderDto(OrderDto orderDto) {
		this.orderDto = orderDto;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public String getTransactionId() {
		return transactionId;
	}



	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	
	
	
}
