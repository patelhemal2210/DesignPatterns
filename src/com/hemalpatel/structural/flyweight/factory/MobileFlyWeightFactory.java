package com.hemalpatel.structural.flyweight.factory;

import java.util.HashMap;
import java.util.Map;

import com.hemalpatel.structural.flyweight.beans.Mobile;

public class MobileFlyWeightFactory implements FlyWeightFactory{

	private Map<Model, Mobile> cache = new HashMap<>();
	
	@Override
	public synchronized Mobile getMobile(Model m) {
		 
		if (!cache.containsKey(m)) {
			
			MobileFactory concreteFactory;
			
			switch(m) {
			case Apple:
				concreteFactory = new AppleMobileFactory();
				break;
			case Google:
				concreteFactory = new GoogleMobileFactory();
				break;
			case Samsung:
				concreteFactory = new SamsungMobileFactory();
				break;
			default:
				concreteFactory = new AppleMobileFactory();
				break;
			}
			
			cache.put(m, concreteFactory.createMobile());
		}
		
		return cache.get(m);
	}

}
