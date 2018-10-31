package com.hemalpatel.behavioral.chainofresponsibility.bean;

public class ATM {

	private DispenserChain dispenser;
	
	public ATM() {
		dispenser = new DispenserChain();
	}
	
	public void dispenseMoney(int amount) {
		dispenser.dispenseMoney(amount);
	}
}
