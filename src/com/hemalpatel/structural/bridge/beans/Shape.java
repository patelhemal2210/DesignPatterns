package com.hemalpatel.structural.bridge.beans;

public abstract class Shape {
	protected Color color;
	
	public Shape(Color c) {
		this.color = c;
	}
	
	abstract public void paint();
	
	abstract public void changePaint(Color c);
}
