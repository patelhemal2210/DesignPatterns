package com.hemalpatel.structural.decorator.beans;


public class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void modify() {
		super.modify();
		System.out.println("Adding features of Luxury Car.");
	}
}
