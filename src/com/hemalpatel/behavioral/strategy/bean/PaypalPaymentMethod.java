package com.hemalpatel.behavioral.strategy.bean;

public class PaypalPaymentMethod implements PaymentMethod{

	@Override
	public void pay(double payment) {
		System.out.println("Paying " + payment + " from Paypal Account");
	}

}
