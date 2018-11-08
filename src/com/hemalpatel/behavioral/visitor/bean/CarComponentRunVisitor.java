package com.hemalpatel.behavioral.visitor.bean;

public class CarComponentRunVisitor implements CarComponentVisitor{

	@Override
	public void visit(Car car) {
		System.out.println("Lets race with this car !");
	}

	@Override
	public void visit(Body body) {
		System.out.println("Car body is just cleaned and ready to race");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Engine getting warm for race");
		
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Wheels ready to burnout");
		
	}

	@Override
	public void visit(Interior interiror) {
		System.out.println("Interior looks motivating for race");
		
	}

}
