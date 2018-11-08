package com.hemalpatel.behavioral.visitor.bean;

public class Engine implements CarComponent{

	@Override
	public void accept(CarComponentVisitor visitor) {
		visitor.visit(this);
	}

}
