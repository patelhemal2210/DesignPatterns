package com.hemalpatel.structural.decorator.beans;

public class CarDecorator implements Car {

	protected Car car;

	public CarDecorator(Car c) {
		this.car = c;
	}
	@Override
	public void modify() {
		this.car.modify();
	}
}
