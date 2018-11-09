package com.hemalpatel.behavioral.interpreter.bean;

public class Interpreter {
	
	public String getBinaryFormat(int number) {
		return Integer.toBinaryString(number);
	}
	
	public String getHexFormat(int number) {
		return Integer.toHexString(number);
	}
}
