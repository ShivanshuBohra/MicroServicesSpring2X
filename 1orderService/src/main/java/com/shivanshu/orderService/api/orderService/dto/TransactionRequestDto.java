package com.shivanshu.orderService.api.orderService.dto;


public class TransactionRequestDto {

	private OrderDto orderDto;
	private PaymentDTO paymentDTO;
	
	public TransactionRequestDto() {
		super();
	}
	
	public TransactionRequestDto(OrderDto orderDto, PaymentDTO paymentDTO) {
		super();
		this.orderDto = orderDto;
		this.paymentDTO = paymentDTO;
	}
	
	
	public OrderDto getOrderDto() {
		return orderDto;
	}
	public void setOrderDto(OrderDto orOrderDto) {
		this.orderDto = orOrderDto;
	}
	public PaymentDTO getPaymentDTO() {
		return paymentDTO;
	}
	public void setPaymentDTO(PaymentDTO paymentDTO) {
		this.paymentDTO = paymentDTO;
	}
	
	
	
	
}
