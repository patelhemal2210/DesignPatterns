package com.hemalpatel.behavioral.chainofresponsibility.bean;

public class DispenserChain {
	
	private CurrencyDispenser initChain;
	
	public DispenserChain() {
		initChain = new Dollar50Dispenser();
		CurrencyDispenser chainTwo = new Dollar20Dispenser();
		CurrencyDispenser chainThree = new Dollar10Dispenser();
		
		initChain.setNextChain(chainTwo);
		chainTwo.setNextChain(chainThree);
	}
	
	public void dispenseMoney(int amount) {
		Currency currency = new Currency(amount);
		initChain.dispenseCurreny(currency);
	}
}
