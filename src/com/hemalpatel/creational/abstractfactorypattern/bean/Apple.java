package com.hemalpatel.creational.abstractfactorypattern.bean;

public class Apple implements Mobile {
	private String processor;
	private String operatingSystem;
	private String memory;
	
	public Apple(String aProcessor, String aOperatingSystem, String aMemory) {
		this.processor = aProcessor;
		this.operatingSystem = aOperatingSystem;
		this.memory = aMemory;
	}
	
	@Override
	public String getProcessor() {
		return processor;
	}

	@Override
	public String getOperatingSystem() {
		return operatingSystem;
	}

	@Override
	public String getMemory() {
		return memory;
	}

}
