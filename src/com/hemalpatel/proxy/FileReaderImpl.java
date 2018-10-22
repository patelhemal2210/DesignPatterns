package com.hemalpatel.proxy;

public class FileReaderImpl implements FileReader {

	@Override
	public void readFile(String fileName) throws Exception{
		/***
		 * detailed implementation goes here
		 */
		
		System.out.println("read file : " + fileName + " successfully");
	}

}
