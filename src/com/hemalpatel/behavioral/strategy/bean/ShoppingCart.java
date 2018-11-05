package com.hemalpatel.behavioral.strategy.bean;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Item> cartItems;
	
	public ShoppingCart() {
		cartItems = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		if(item != null) {
			cartItems.add(item);
		}
	}
	
	public Item removeItem(Item item) {
		for(Item i : cartItems) {
			if(i.getId() == item.getId()) {
				cartItems.remove(item);
				return i;
			}
		}
		return null;
	}
	
	public double getTotal() {
		double total = 0.0;
		for(Item i : cartItems) {
			total += i.getPrice();
		}
		return total;
	}
	
	public void pay(PaymentMethod gateway) {
		if(gateway != null) {
			gateway.pay(getTotal());
		}
	}
}
