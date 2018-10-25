package com.hemalpatel.structural.bridge.beans;

public class Triangle extends Shape{

	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void paint() {
		System.out.println("Triangle is getting painted with " + color.getName());
		color.paint();
	}

	@Override
	public void changePaint(Color c) {
		System.out.println("Hexagon color is getting changed from " + super.color.getName() + " to " + c.getName());
		super.color = c;
		paint();
	}

}
