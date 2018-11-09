package com.hemalpatel.behavioral.interpreter.bean;

public class ToHexExpression implements Expression{

	private int number;
	
	public ToHexExpression(int number) {
		this.number = number;
	}
	
	@Override
	public String interpret(Interpreter ip) {
		return ip.getHexFormat(number);
	}

}
