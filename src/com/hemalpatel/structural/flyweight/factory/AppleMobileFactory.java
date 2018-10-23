package com.hemalpatel.structural.flyweight.factory;

import com.hemalpatel.structural.flyweight.beans.Apple;
import com.hemalpatel.structural.flyweight.beans.Mobile;

public class AppleMobileFactory implements MobileFactory{

	@Override
	public Mobile createMobile() {
		return new Apple();
	}
}
