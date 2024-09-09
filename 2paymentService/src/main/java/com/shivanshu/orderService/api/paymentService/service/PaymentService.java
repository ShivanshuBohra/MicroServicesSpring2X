package com.shivanshu.orderService.api.paymentService.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivanshu.orderService.api.paymentService.entity.Payment;
import com.shivanshu.orderService.api.paymentService.repository.PaymentReposity;

@Service
public class PaymentService {

	@Autowired
	private PaymentReposity paymentReposity;
	
	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return paymentReposity.save(payment);
	}
	
	public String paymentProcessing() {
		//api should be 3rd party  payment gateway (paypal , paytm)
		return new Random().nextBoolean()?"success":"false";
	}
	
	public Payment getPaymentHistoryByOrderId(int orderId) {
		return paymentReposity.findByOrderId(orderId);
	}
}
