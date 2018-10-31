package com.hemalpatel.behavioral.chainofresponsibility.bean;

public class Dollar10Dispenser implements CurrencyDispenser{
	private CurrencyDispenser nextChain;
	
	@Override
	public void setNextChain(CurrencyDispenser chain) {
		this.nextChain = chain;
	}
	
	@Override
	public void dispenseCurreny(Currency currency) {
		int amount = currency.getAmout();
		if(amount >= 10) {
			int count = amount / 10;
			int remainder = amount % 10;
			System.out.println("Machine Dispensing "+ count + "  $10 Bills");
			if(remainder > 0) {
				this.nextChain.dispenseCurreny(new Currency(remainder));
			}
		}
		else {
			this.nextChain.dispenseCurreny(currency);
		}	
	}
}
