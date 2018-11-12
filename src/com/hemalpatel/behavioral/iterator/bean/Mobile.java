package com.hemalpatel.behavioral.iterator.bean;

public class Mobile {
	private String name;
	private MobileTypeEnum type;
	
	public Mobile(String name, MobileTypeEnum type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public MobileTypeEnum getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", Type=" + type + "]";
	}
	
	
}
