package com.hemalpatel.behavioral.template.bean;

public class StoreOrder implements OrderTemplate{

	@Override
	public void selectProduct() {
		System.out.println("Select store product you want to buy");
		
	}

	@Override
	public void putIntoCart() {
		System.out.println("Add product to physical cart");
		
	}

	@Override
	public void giftWrap() {
		System.out.println("Gift wrap the store product");
		
	}

	@Override
	public void writeMessage() {
		System.out.println("Write love message to receiver");
	}

	@Override
	public void doPayment() {
		System.out.println("Pay with cash or card");
		
	}

	@Override
	public void doDelivery() {
		System.out.println("Bring the product home");
		
	}

}
