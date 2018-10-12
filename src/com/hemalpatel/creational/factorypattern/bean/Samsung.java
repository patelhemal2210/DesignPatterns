package com.hemalpatel.creational.factorypattern.bean;

public class Samsung implements Mobile{

	private String processor;
	private String operatingSystem;
	private String memory;
	
	public Samsung(String aProcessor, String aOperatingSystem, String aMemory) {
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
