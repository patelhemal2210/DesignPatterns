package com.hemalpatel.behavioral.strategy.bean;

public class GiftCardPaymentMethod implements PaymentMethod{

	@Override
	public void pay(double payment) {
		System.out.println("Paying " + payment + " from Gift Card");
	}

}
