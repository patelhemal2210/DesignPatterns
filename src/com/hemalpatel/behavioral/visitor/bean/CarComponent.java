package com.hemalpatel.behavioral.visitor.bean;

public interface CarComponent {
	public void accept(CarComponentVisitor visitor);
}
