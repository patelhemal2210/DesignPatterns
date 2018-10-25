package com.hemalpatel.structural.bridge.beans;

public class RedColor implements Color{

	private String name = "Red";
	@Override
	public void paint() {
		System.out.println("... DONE! painting with " + name);
	}

	@Override
	public String getName() {
		return name;
	}

}
