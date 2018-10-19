package com.hemalpatel.structural.composite.beans;

import java.util.List;

public interface Employee {
	
	public void add(Employee emp);
	
	public void remove(Employee emp);
	
	public String getName();
	
	public String getPosition();
	
	public void printSelfAndChild();
	
	default public void printDetails() {
		System.out.println("name : " + getName());
		System.out.println("Postion: " + getPosition());
		System.out.println("------");
	}
}
