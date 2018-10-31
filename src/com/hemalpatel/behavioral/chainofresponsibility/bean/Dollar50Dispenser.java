package com.hemalpatel.behavioral.chainofresponsibility.bean;

public class Dollar50Dispenser implements CurrencyDispenser{

	private CurrencyDispenser nextChain;
	
	@Override
	public void setNextChain(CurrencyDispenser chain) {
		this.nextChain = chain;
	}
	
	@Override
	public void dispenseCurreny(Currency currency) {
		int amount = currency.getAmout();
		if(amount >= 50) {
			int count = amount / 50;
			int remainder = amount % 50;
			System.out.println("Machine Dispensing "+ count + "  $50 Bills");
			if(remainder > 0) {
				this.nextChain.dispenseCurreny(new Currency(remainder));
			}
		}
		else {
			this.nextChain.dispenseCurreny(currency);
		}	
	}
}
