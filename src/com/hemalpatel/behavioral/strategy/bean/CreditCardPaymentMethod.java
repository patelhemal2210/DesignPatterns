package com.hemalpatel.behavioral.strategy.bean;

public class CreditCardPaymentMethod implements PaymentMethod{

	@Override
	public void pay(double payment) {
		System.out.println("Paying " + payment + " from Credit Card");
	}

}
