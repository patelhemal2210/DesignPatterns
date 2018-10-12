package com.hemalpatel.creational.factorypattern;

import com.hemalpatel.creational.factorypattern.bean.Mobile;
import com.hemalpatel.creational.factorypattern.bean.Apple;
import com.hemalpatel.creational.factorypattern.bean.Samsung;

public class MobileFactory {

	public static Mobile getMobile(MobileType type, String processor, String operatingSystem, String memory) {
		Mobile requestedMobile = null;
		
		switch(type) {
		case APPLE:
			requestedMobile = new Apple(processor, operatingSystem, memory);
			break;
		case SAMSUNG:
			requestedMobile = new Samsung(processor, operatingSystem, memory);
			break;
		default:
			requestedMobile = null;
			break;
		}
		
		return requestedMobile;
	}
}
