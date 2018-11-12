package com.hemalpatel.behavioral.iterator.bean;

import java.util.List;

public interface MobileCollection {

	public void addMobile(Mobile m);
	
	public void removeMobile(Mobile m);
	
	public MobileIterator iterator(MobileTypeEnum type);
	
}
