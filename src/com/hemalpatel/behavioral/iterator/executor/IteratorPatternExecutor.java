package com.hemalpatel.behavioral.iterator.executor;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.behavioral.iterator.bean.Mobile;
import com.hemalpatel.behavioral.iterator.bean.MobileCollection;
import com.hemalpatel.behavioral.iterator.bean.MobileCollectionImpl;
import com.hemalpatel.behavioral.iterator.bean.MobileIterator;
import com.hemalpatel.behavioral.iterator.bean.MobileTypeEnum;

public class IteratorPatternExecutor implements BaseExecutor {

	@Override
	public void run() {
		printTitle();
		MobileCollection mobiles = prepareCollection();
		
		System.out.println("Android Iterator : ");
		MobileIterator androidIterator = mobiles.iterator(MobileTypeEnum.ANDROID);
		while(androidIterator.hasNext()) {
			System.out.println(androidIterator.next().toString());
		}
		
		System.out.println("\nApple Iterator : ");
		MobileIterator appleIterator = mobiles.iterator(MobileTypeEnum.APPLE);
		while(appleIterator.hasNext() ) {
			System.out.println(appleIterator.next().toString());
		}
		
		System.out.println("\nAll Iterator : ");
		MobileIterator allIterator = mobiles.iterator(MobileTypeEnum.ALL);
		while(allIterator.hasNext() ) {
			System.out.println(allIterator.next().toString());
		}
		printFooter();
	}
	
	private MobileCollection prepareCollection() {
		MobileCollection mobiles = new MobileCollectionImpl();
		
		Mobile samsungS7 = new Mobile("Samsung 7", MobileTypeEnum.ANDROID);
		Mobile samsungS8 = new Mobile("Samsung 8", MobileTypeEnum.ANDROID);
		Mobile samsungS9 = new Mobile("Samsung 9", MobileTypeEnum.ANDROID);
		
		Mobile iphone6 = new Mobile("Iphone 6", MobileTypeEnum.APPLE);
		Mobile iphone7 = new Mobile("Iphone 7", MobileTypeEnum.APPLE);
		Mobile iphone8 = new Mobile("Iphone 8", MobileTypeEnum.APPLE);
		
		mobiles.addMobile(samsungS7);
		mobiles.addMobile(samsungS8);
		mobiles.addMobile(samsungS9);
		
		mobiles.addMobile(iphone6);
		mobiles.addMobile(iphone7);
		mobiles.addMobile(iphone8);
		
		return mobiles;
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Behavioral Patterns");
		System.out.println("---- Iterator Pattern\n");
	}
	
	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Iterator Pattern --");
		System.out.println("*********************************\n");
	}


}
