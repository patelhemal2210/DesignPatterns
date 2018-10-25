package com.hemalpatel.structural.bridge.beans;

public class BlueColor implements Color {

	private String name = "Blue";
	@Override
	public void paint() {
		System.out.println("... DONE! painting with " + name);
	}

	@Override
	public String getName() {
		return name;
	}
}
