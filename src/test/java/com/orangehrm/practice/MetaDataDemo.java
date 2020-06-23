package com.orangehrm.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetaDataDemo {
	
	String dbUrl = "jdbc:oracle:thin:@syntaxdatabase.cdjflmucstpo.us-east-1.rds.amazonaws.com:1521:orcl";

	String dbUsername = "Syntax";

	String dbPassword = "syntax123";

	@Test
	public void getMetaData() throws SQLException {

		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		DatabaseMetaData dbMetaData = conn.getMetaData();
		String dbName = dbMetaData.getDatabaseProductName();
		System.out.println(dbName);

		String dbVersion = dbMetaData.getDatabaseProductVersion();
		System.out.println(dbVersion);

		// ------------------------------------------------------

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("Select * from employees where job_id='IT_PROG'");
		ResultSetMetaData rsMetaData = rs.getMetaData();
		// get total num of col
		int colNum = rsMetaData.getColumnCount();
		System.out.println(colNum);
		// get name of specified col
		String colName = rsMetaData.getColumnName(2);
		System.out.println(colName);
		// print all col name

		for (int i = 1; i <= colNum; i++) {
			System.out.println(rsMetaData.getColumnName(i));
		}

		rs.close();
		st.close();
		conn.close();
	}
}
