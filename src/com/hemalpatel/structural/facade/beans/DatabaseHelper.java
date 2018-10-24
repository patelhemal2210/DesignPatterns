package com.hemalpatel.structural.facade.beans;

import java.sql.Connection;

public interface DatabaseHelper {
	public Connection getDatabaseConnection();
	public void generatePDFReport(String tableName, Connection conn);
	public void generateXMLReport(String tableName, Connection conn);
}
