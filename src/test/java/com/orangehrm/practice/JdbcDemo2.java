package com.orangehrm.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JdbcDemo2 {

	String dbUrl = "jdbc:oracle:thin:@syntaxdatabase.cdjflmucstpo.us-east-1.rds.amazonaws.com:1521:orcl";

	String dbUsername = "Syntax";

	String dbPassword = "syntax123";

	@Test
	public void dbConnection() throws SQLException {
		Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		Statement stat = con.createStatement();

		ResultSet result = stat.executeQuery("Select department_id,department_name from departments");

		while (result.next()) {
			String department_id = result.getString("Department_id");
			String department_name = result.getString("Department_name");

			System.out.println(department_id + " " + department_name);
		}

		result.close();
		stat.close();
		con.close();
	}

}
