package com.hemalpatel.creational.abstractfactorypattern.factory;

import com.hemalpatel.creational.abstractfactorypattern.bean.Samsung;
import com.hemalpatel.creational.abstractfactorypattern.bean.Mobile;

public class SamsungFactory implements MobileAbstractFactory {

	private String processor;
	private String operatingSystem;
	private String memory;
	
	public SamsungFactory(String aProcessor, String aOperatingSystem, String aMemory) {
		this.processor = aProcessor;
		this.operatingSystem = aOperatingSystem;
		this.memory = aMemory;
	}
	
	@Override
	public Mobile createMobile() {
		return new Samsung(processor, operatingSystem, memory);
	}
}
