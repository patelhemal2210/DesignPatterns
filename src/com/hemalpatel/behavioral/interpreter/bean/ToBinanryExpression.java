package com.hemalpatel.behavioral.interpreter.bean;

public class ToBinanryExpression implements Expression{

	private int number;
	
	public ToBinanryExpression(int number) {
		this.number = number;
	}
	
	@Override
	public String interpret(Interpreter ip) {
		return ip.getBinaryFormat(number);
	}

}
