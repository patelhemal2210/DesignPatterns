package com.hemalpatel.structural.flyweight.factory;

import com.hemalpatel.structural.flyweight.beans.Google;
import com.hemalpatel.structural.flyweight.beans.Mobile;

public class GoogleMobileFactory implements MobileFactory{
	@Override
	public Mobile createMobile() {
		return new Google();
	}
}
