package com.hemalpatel.creational.abstractfactorypattern.factory;

import com.hemalpatel.creational.abstractfactorypattern.bean.Google;
import com.hemalpatel.creational.abstractfactorypattern.bean.Mobile;

public class GoogleFactory implements MobileAbstractFactory{

	private String processor;
	private String operatingSystem;
	private String memory;
	
	public GoogleFactory(String aProcessor, String aOperatingSystem, String aMemory) {
		this.processor = aProcessor;
		this.operatingSystem = aOperatingSystem;
		this.memory = aMemory;
	}
	
	@Override
	public Mobile createMobile() {
		return new Google(processor, operatingSystem, memory);
	}

}
