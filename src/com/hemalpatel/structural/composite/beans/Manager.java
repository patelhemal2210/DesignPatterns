package com.hemalpatel.structural.composite.beans;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
	
	private String name;
	private String position;
	
	private List<Employee> employees = new ArrayList<>();
	
	public Manager(String aName, String aPosition) {
		this.name = aName;
		this.position = aPosition;
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
	
	public void add(Employee emp) {
		employees.add(emp);
	}
	
	public void remove(Employee emp) {
		employees.remove(emp);
	}
	
	public void printSelfAndChild() {
		printDetails();
		for (Employee employee : employees) {
			employee.printSelfAndChild();
		}
	}
}
