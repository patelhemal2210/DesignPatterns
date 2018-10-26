package com.hemalpatel.structural.decorator.beans;

public class SportsCar extends CarDecorator{

	public SportsCar(Car c) {
		super(c);
	}
	
	@Override
	public void modify(){
		super.modify();
		System.out.println(" Adding features of Sports Car.");
	}

}
