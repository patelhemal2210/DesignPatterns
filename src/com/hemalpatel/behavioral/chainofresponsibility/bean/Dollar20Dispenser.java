package com.hemalpatel.behavioral.chainofresponsibility.bean;

public class Dollar20Dispenser implements CurrencyDispenser{
	
	private CurrencyDispenser nextChain;
	
	@Override
	public void setNextChain(CurrencyDispenser chain) {
		this.nextChain = chain;
	}
	
	@Override
	public void dispenseCurreny(Currency currency) {
		int amount = currency.getAmout();
		if(amount >= 20) {
			int count = amount / 20;
			int remainder = amount % 20;
			System.out.println("Machine Dispensing "+ count + "  $20 Bills");
			if(remainder > 0) {
				this.nextChain.dispenseCurreny(new Currency(remainder));
			}
		}
		else {
			this.nextChain.dispenseCurreny(currency);
		}	
	}
}
