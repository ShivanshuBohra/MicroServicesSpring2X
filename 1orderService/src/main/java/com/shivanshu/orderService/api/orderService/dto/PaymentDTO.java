package com.shivanshu.orderService.api.orderService.dto;


public class PaymentDTO {

   private int paymentId;
   private String paymentStatus;
   private String transactionId;
   private int orderId;
   private double amount;


public PaymentDTO() {
	super();
	// TODO Auto-generated constructor stub
}


public PaymentDTO(int paymentId, String paymentStatus, String transactionId, int orderId, int amount) {
	super();
	this.paymentId = paymentId;
	this.paymentStatus = paymentStatus;
	this.transactionId = transactionId;
	this.orderId = orderId;
	this.amount = amount;
}

public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public String getPaymentStatus() {
	return paymentStatus;
}
public void setPaymentStatus(String paymentStatus) {
	this.paymentStatus = paymentStatus;
}
public String getTransactionId() {
	return transactionId;
}
public void setTransactionId(String transactionId) {
	this.transactionId = transactionId;
}
   


public int getOrderId() {
	return orderId;
}

public void setOrderId(int orderId) {
	this.orderId = orderId;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}
   
   

}
