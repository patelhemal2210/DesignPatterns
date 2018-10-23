package com.hemalpatel.structural.flyweight.beans;

public class MobileCustomSpecification implements CustomSpecification{

	private String storage;
	private String memory;
	
	public MobileCustomSpecification(String aStorage, String aMemory) {
		this.storage = aStorage;
		this.memory = aMemory;
	}
	
	@Override
	public String getStorage() {
		return storage;
	}

	@Override
	public String getMemory() {
		return memory;
	}

	@Override
	public void printCustomisations() {
		System.out.println("----- Customisation -----");
		System.out.println("Memory : " + getMemory());
		System.out.println("Storage : " + getStorage());
	}

}
