package com.hemalpatel.creational.abstractfactorypattern.factory;

import com.hemalpatel.creational.abstractfactorypattern.bean.Apple;
import com.hemalpatel.creational.abstractfactorypattern.bean.Mobile;

public class AppleFactory implements MobileAbstractFactory {

	private String processor;
	private String operatingSystem;
	private String memory;
	
	public AppleFactory(String aProcessor, String aOperatingSystem, String aMemory) {
		this.processor = aProcessor;
		this.operatingSystem = aOperatingSystem;
		this.memory = aMemory;
	}
	
	@Override
	public Mobile createMobile() {
		return new Apple(processor, operatingSystem, memory);
	}
}
