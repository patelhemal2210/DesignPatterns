package com.hemalpatel.behavioral.iterator.bean;

import java.util.ArrayList;
import java.util.List;

public class MobileCollectionImpl implements MobileCollection {

	private List<Mobile> mobileList;
	
	public MobileCollectionImpl() {
		mobileList = new ArrayList<>();
	}

	@Override
	public void addMobile(Mobile m) {
		this.mobileList.add(m);
	}

	@Override
	public void removeMobile(Mobile m) {
		this.mobileList.remove(m);
	}

	@Override
	public MobileIterator iterator(MobileTypeEnum type) {
		return new MobileIteratorImpl(type, mobileList);
	}
	
	private class MobileIteratorImpl implements MobileIterator {

		private MobileTypeEnum type;
		private List<Mobile> list;
		private int position;
		
		public MobileIteratorImpl(MobileTypeEnum type, List<Mobile> list) {
			this.type = type;
			this.list = list;
			this.position = 0;
		}
		
		@Override
		public boolean hasNext() {
			while(position < list.size()) {
				Mobile mobile = list.get(position);
				if(mobile.getType() == this.type || type.equals(MobileTypeEnum.ALL)) {
					return true;
				}
				else {
					position++;
				}
			}
			return false;
		}

		@Override
		public Mobile next() {
			Mobile m = list.get(position);
			position++;
			return m;
		}
		
	}
	
}
