package com.hemalpatel.behavioral.template.bean;

public class OnlineOrder implements OrderTemplate{

	@Override
	public void selectProduct() {
		System.out.println("Select online product you want to buy");
		
	}

	@Override
	public void putIntoCart() {
		System.out.println("Add product to online cart");
		
	}

	@Override
	public void giftWrap() {
		System.out.println("Gift wrap the online product");
		
	}

	@Override
	public void writeMessage() {
		System.out.println("Send love message to receiver");
		
	}

	@Override
	public void doPayment() {
		System.out.println("pay with your digital payment method");
		
	}

	@Override
	public void doDelivery() {
		System.out.println("Online order is out for delivery");
		
	}

}
