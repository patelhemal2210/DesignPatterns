package com.hemalpatel.structural.facade.beans;

import java.sql.Connection;

public class OracleDatabaseHelper implements DatabaseHelper {

	@Override
	public Connection getDatabaseConnection() {
		return null;
	}

	@Override
	public void generatePDFReport(String tableName, Connection conn) {
		System.out.println("Generated PDF report for table " + tableName + " from Oracle Database");
	}

	@Override
	public void generateXMLReport(String tableName, Connection conn) {
		System.out.println("Generated XML report for table " + tableName + " from Oracle Database");
	}
	
}
