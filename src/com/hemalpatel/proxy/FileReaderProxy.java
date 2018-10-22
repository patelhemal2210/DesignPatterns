package com.hemalpatel.proxy;

public class FileReaderProxy implements FileReader{

	private boolean isAdmin;
	private FileReaderImpl executor;
	
	
	public FileReaderProxy(String userName, String password) {
		if(userName.equals("hemal") && password.equals("pass")) {
			isAdmin = true;
		}
		executor = new FileReaderImpl();
	}
	
	@Override
	public void readFile(String fileName) throws Exception {
		if(isAdmin) {
			executor.readFile(fileName);
		}
		else {
			if(fileName.trim().startsWith("imp-")) {
				throw new Exception("File can only be accessed by admin.");
			}
			else {
				executor.readFile(fileName);
			}
		}
	}

	
}
