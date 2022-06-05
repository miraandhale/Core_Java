package com.mira;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Fetch the data or record from a mysql database using select query
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//provide connectivity
		try
		{
		//1.load the driver for SQl
		//Class.forName("com.mysql.jdbc.Driver");
		
		//1.load the driver for Oracle
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.Establish Connection
		
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","avnil8669"); 
		//port number for Oracle:1521
		//Ojdbc14.jar file for Oracle databse
		//xe:oracle service file
		//2.Establish Connection
        //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","Mira@123");
		/*url=jdbc:mysql://localhost:3306/Student
		 * port number of mysql=3306
		 * databaseName=Student
		 * username=root
		 * password=root
		 */
		
		//3.Create statement
		
		Statement stmt=con.createStatement();
		
		
		//4.Execute stmt
		
		ResultSet r=stmt.executeQuery("select * from Employee");
		while(r.next())
		{
			System.out.println(r.getInt(1)+" "+r.getString(2));
		}
		
		//5.close
		con.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
