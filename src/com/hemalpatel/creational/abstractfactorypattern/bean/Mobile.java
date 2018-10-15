package com.hemalpatel.creational.abstractfactorypattern.bean;

public interface Mobile {

	public String getProcessor();
	public String getOperatingSystem();
	public String getMemory();
	
	public default String getMobileDetails() {
		return "Processor : " + getProcessor() + "\nOperating System : " + getOperatingSystem() + "\nMemory : " + getMemory();
	}
}
