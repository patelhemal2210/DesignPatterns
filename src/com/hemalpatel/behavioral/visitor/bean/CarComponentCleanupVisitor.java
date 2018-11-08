package com.hemalpatel.behavioral.visitor.bean;

public class CarComponentCleanupVisitor implements CarComponentVisitor{

	@Override
	public void visit(Car car) {
		System.out.println("Car is looking clean");
	}

	@Override
	public void visit(Body body) {
		System.out.println("Body is so dusty, washing is in progress");
		
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Engine oil is getting changed");
		
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Wheels are getting polished");
		
	}

	@Override
	public void visit(Interior interiror) {
		System.out.println("Iterior is getting cleaned");
		
	}

}
