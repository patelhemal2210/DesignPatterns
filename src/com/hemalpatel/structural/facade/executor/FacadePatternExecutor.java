package com.hemalpatel.structural.facade.executor;

import java.sql.Connection;

import com.hemalpatel.base.BaseExecutor;
import com.hemalpatel.structural.facade.beans.DatabaseHelper;
import com.hemalpatel.structural.facade.beans.DatabaseHelperFacade;
import com.hemalpatel.structural.facade.beans.MySqlDatabaseHelper;
import com.hemalpatel.structural.facade.beans.OracleDatabaseHelper;

public class FacadePatternExecutor implements BaseExecutor{

	@Override
	public void run() {
		printTitle();
		
		/***
		 * Without Facade class
		 */
		System.out.println("-- Without Facade Class");
		System.out.println("---- MYSQL");
		DatabaseHelper mySqlHelper = new MySqlDatabaseHelper();
		Connection sqlConn = mySqlHelper.getDatabaseConnection();
		mySqlHelper.generatePDFReport("Users", sqlConn);
		mySqlHelper.generateXMLReport("Users", sqlConn);
		
		System.out.println("---- Oracle");
		DatabaseHelper oracleHelper = new OracleDatabaseHelper();
		Connection oracleConn = oracleHelper.getDatabaseConnection();
		oracleHelper.generatePDFReport("Users", oracleConn);
		oracleHelper.generateXMLReport("Users", oracleConn);
		
		/***
		 * With Facade
		 */
		System.out.println("\n-- With Facade Class");
		System.out.println("---- MYSQL");
		DatabaseHelperFacade.generateReport(DatabaseHelperFacade.DBTypes.MYSQL, DatabaseHelperFacade.ReportTypes.PDF, "Users");
		DatabaseHelperFacade.generateReport(DatabaseHelperFacade.DBTypes.MYSQL, DatabaseHelperFacade.ReportTypes.XML, "Users");
		
		System.out.println("---- Oracle");
		DatabaseHelperFacade.generateReport(DatabaseHelperFacade.DBTypes.ORACLE, DatabaseHelperFacade.ReportTypes.PDF, "Users");
		DatabaseHelperFacade.generateReport(DatabaseHelperFacade.DBTypes.ORACLE, DatabaseHelperFacade.ReportTypes.XML, "Users");
		
		
		printFooter();
	}

	@Override
	public void printTitle() {
		System.out.println("\n*********************************");
		System.out.println("-- Structural Patterns");
		System.out.println("---- Facade Pattern\n");
		
	}

	@Override
	public void printFooter() {
		System.out.println("\n-- END OF Facade Pattern --");
		System.out.println("*********************************\n");		
		
	}

}
