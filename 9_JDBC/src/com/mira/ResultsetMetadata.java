package com.mira;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultsetMetadata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		//1.load the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.Establish Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student123","root","root");
		/*url=jdbc:mysql://localhost:3306/Student
		 * port number of mysql=3306
		 * databaseName=Student
		 * username=root
		 * password=root
		 */
		
		
		//database metadata
		
		DatabaseMetaData d=con.getMetaData();
		
		System.out.println("Database name:"+d.getDatabaseProductName());
		
		
		//3.Create statement
	/*	Statement st=con.createStatement();
		
		
		//Execute Query
		ResultSet r=st.executeQuery("Select * from stud");
		
		ResultSetMetaData rm=r.getMetaData();
		
		System.out.println("first column name:"+rm.getColumnName(1));
		
		System.out.println("total columns :"+rm.getColumnCount());
	   */ 
		
		
		//5.close
		con.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}
