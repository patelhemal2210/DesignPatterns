package com.hemalpatel.structural.facade.beans;

import java.sql.Connection;

public class DatabaseHelperFacade {
	
	public static enum DBTypes{
		MYSQL,ORACLE;
	}
	
	public static enum ReportTypes{
		PDF,XML;
	}
	
	public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
		
		Connection conn = null;
		DatabaseHelper databaseHelper = null;
		
		switch(dbType) {
		case MYSQL:
			databaseHelper = new MySqlDatabaseHelper();
			break;
		case ORACLE:
			databaseHelper = new OracleDatabaseHelper();
			break;
		}
		
		conn = databaseHelper.getDatabaseConnection();
		
		switch(reportType) {
		case PDF:
			databaseHelper.generatePDFReport(tableName, conn);
			break;
		case XML:
			databaseHelper.generateXMLReport(tableName, conn);
			break;
		}
	}
}
