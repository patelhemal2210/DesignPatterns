package com.hemalpatel.behavioral.visitor.bean;

public interface CarComponentVisitor {
	public void visit(Car car);
	public void visit(Body body);
	public void visit(Engine engine);
	public void visit(Wheel wheel);
	public void visit(Interior interiror);
}
