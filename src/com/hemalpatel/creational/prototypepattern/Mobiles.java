package com.hemalpatel.creational.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class Mobiles implements Cloneable {

private List<String> mobileDatabase;
	
	public Mobiles(){
		mobileDatabase = new ArrayList<String>();
	}
	
	public Mobiles(List<String> list){
		this.mobileDatabase=list;
	}
	
	public void loadDatabase(){
		mobileDatabase.add("iPhone X");
		mobileDatabase.add("Samsung G7");
		mobileDatabase.add("Goggle Pixel");
		mobileDatabase.add("iPhone XS");
	}
	
	public List<String> getMobileDatabase() {
		return mobileDatabase;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getMobileDatabase()){
				temp.add(s);
			}
			return new Mobiles(temp);
	}
	
}
