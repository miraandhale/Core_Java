package com.mira;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestResultset {

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
		
		//3.create stmt
        Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		
		//4.Execute stmt
		
		ResultSet r=stmt.executeQuery("select * from stud");
		
		r.absolute(3);
		while(r.next())
		{
		System.out.println(r.getInt(1)+" "+r.getString(2));
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
