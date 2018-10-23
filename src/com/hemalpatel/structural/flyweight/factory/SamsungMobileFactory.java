package com.hemalpatel.structural.flyweight.factory;

import com.hemalpatel.structural.flyweight.beans.Mobile;
import com.hemalpatel.structural.flyweight.beans.Samsung;

public class SamsungMobileFactory implements MobileFactory{
	@Override
	public Mobile createMobile() {
		return new Samsung();
	}

}
