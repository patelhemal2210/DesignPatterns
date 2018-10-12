package com.hemalpatel.creational.factorypattern.bean;

public interface Mobile {
	
	public String getProcessor();
	public String getOperatingSystem();
	public String getMemory();
	
	public default String getMobileDetails() {
		return "Processor : " + getProcessor() + "\nOperating System : " + getOperatingSystem() + "\nMemory : " + getMemory();
	}
	
}
