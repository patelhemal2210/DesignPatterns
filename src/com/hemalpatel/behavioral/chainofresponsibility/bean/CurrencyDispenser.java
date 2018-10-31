package com.hemalpatel.behavioral.chainofresponsibility.bean;

public interface CurrencyDispenser {
	public void setNextChain(CurrencyDispenser chain);
	public void dispenseCurreny(Currency currency);
}
