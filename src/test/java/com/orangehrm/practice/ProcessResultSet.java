package com.orangehrm.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ProcessResultSet {
	String dbUrl = "jdbc:oracle:thin:@syntaxdatabase.cdjflmucstpo.us-east-1.rds.amazonaws.com:1521:orcl";
	String dbUsername = "Syntax";
	String dbPassword = "syntax123";

	// @Test
	public void getResultSetData() throws SQLException {

		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT FIRST_NAME, LAST_NAME FROM EMPLOYEES WHERE JOB_ID='IT_PROG'");

		List<Map<String, String>> rsList = new ArrayList<>();

		while (rs.next()) {
			Map<String, String> rsMap = new HashMap<>();
			rsMap.put("FIRST_NAME", rs.getString("FIRST_NAME"));
			rsMap.put("Last_name", rs.getString("Last_name"));
			rsList.add(rsMap);
		}

		System.out.println(rsList);

		rs.close();
		st.close();
		conn.close();
	}

	// process query that will give result of street address, city and country name
	// and store results inside the list
	
	//@Test
	public void task() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(
				"SELECT STREET_ADDRESS,City,COUNTRY_NAME FROM LOCATIONS L JOIN COUNTRIES C on c.country_id=l.country_id");
		List<Map<String, String>> rsList = new ArrayList<>();

		while (rs.next()) {
			Map<String, String> rsMap = new HashMap<>();
			rsMap.put("street_address", rs.getString("street_address"));
			rsMap.put("City", rs.getString("City"));
			rsMap.put("COUNTRY_NAME", rs.getString("COUNTRY_NAME"));
			rsList.add(rsMap);

		}
		System.out.println(rsList);
		rs.close();
		st.close();
		conn.close();
	}
	
	@Test
	public void getResultSetData2() throws SQLException {
		
		Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st=conn.createStatement();
		
		String query="select * from jobs";
		ResultSet rs=st.executeQuery(query);
		ResultSetMetaData rsMetaData=rs.getMetaData();
		
		List<Map<String,String>> rsList=new ArrayList<>();
		
		while(rs.next()) {
			
			Map<String,String> rsMap=new HashMap<>();
			for (int i=1;i<=rsMetaData.getColumnCount();i++) {
				rsMap.put(rsMetaData.getCatalogName(i), rs.getObject(i).toString());
			}
			rsList.add(rsMap);
		}
		System.out.println(rsList);
		
		rs.close();
		st.close();
		conn.close();
	}
	
	
	
	
	

	// @Test
	public void review() {

		Map<String, String> map = new HashMap<String, String>();
		map.put("first_name", "Alexander");
		map.put("first_name", "Bruce");
		map.put("first_name", "David");

		System.out.println(map.size());
		System.out.println(map);
	}
}