package com.shivanshu.orderService.api.orderService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shivanshu.orderService.api.orderService.dto.OrderDto;
import com.shivanshu.orderService.api.orderService.dto.PaymentDTO;
import com.shivanshu.orderService.api.orderService.dto.TransactionRequestDto;
import com.shivanshu.orderService.api.orderService.dto.TransactionResponseDto;
import com.shivanshu.orderService.api.orderService.entity.Order;
import com.shivanshu.orderService.api.orderService.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	

	
	public TransactionResponseDto saveOrder(TransactionRequestDto request) {
		String responseMessage = "";
		OrderDto orderDto = request.getOrderDto();
		PaymentDTO paymentDto = request.getPaymentDTO();
		paymentDto.setOrderId(orderDto.getId());
		paymentDto.setAmount(orderDto.getPrice());
		PaymentDTO paymentResponse =  new RestTemplate().postForObject("http://localhost:9191/payment/doPayment", paymentDto, PaymentDTO.class);
		
		responseMessage = paymentResponse.getPaymentStatus().equals("success")?"payment process successful":"payment failed";
		
		return new TransactionResponseDto(orderDto, paymentResponse.getAmount(), paymentResponse.getTransactionId(), responseMessage);
	}
}
