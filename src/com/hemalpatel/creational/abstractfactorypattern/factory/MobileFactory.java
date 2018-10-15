package com.hemalpatel.creational.abstractfactorypattern.factory;

import com.hemalpatel.creational.abstractfactorypattern.bean.Mobile;

public interface MobileFactory {
	public static Mobile getMobile(MobileAbstractFactory factory) {
		return factory.createMobile();
	}
}
