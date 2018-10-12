package com.hemalpatel.creational.factorypattern.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.creational.factorypattern.MobileFactory;
import com.hemalpatel.creational.factorypattern.MobileType;
import com.hemalpatel.creational.factorypattern.bean.Mobile;

public class FactoryPatternExecutor implements BaseExecutor {

	@Override
	public void run() {
		Mobile mobile1 = MobileFactory.getMobile(MobileType.APPLE, "Hexa-core", "iOS", "256 GB");
		System.out.println("APPLE Mobile details : ");
		System.out.println(mobile1.getMobileDetails());
		
		Mobile mobile2 = MobileFactory.getMobile(MobileType.SAMSUNG, "Octa-core", "Android", "128 GB");
		System.out.println("\nSAMSUNG Mobile details : ");
		System.out.println(mobile2.getMobileDetails());
	}

}
