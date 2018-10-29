package com.hemalpatel.behavioral.template.bean;

public interface OrderTemplate {

	public default void OrderProcess(boolean isGift) {
		selectProduct();
		putIntoCart();
		if(isGift) {
			giftWrap();
			writeMessage();
		}
		doPayment();
		doDelivery();
	}
	
	public default void selectProduct() {
		System.out.println("Select product you want to buy");
	};
	public void putIntoCart();
	public default void giftWrap() {
		System.out.println("Gift wrap the product");
	};
	public void writeMessage();
	public void doPayment();
	public void doDelivery();
}
