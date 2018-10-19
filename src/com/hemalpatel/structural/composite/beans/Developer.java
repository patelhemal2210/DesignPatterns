package com.hemalpatel.structural.composite.beans;

import java.util.List;

public class Developer implements Employee{

	private String name;
	private String position;
	
	public Developer(String aName, String aPosition) {
		this.setName(aName);
		this.setPosition(aPosition);
	}

	@Override
	public void add(Employee emp) {
	}

	@Override
	public void remove(Employee emp) {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public void printSelfAndChild() {
		printDetails();
	}

}
