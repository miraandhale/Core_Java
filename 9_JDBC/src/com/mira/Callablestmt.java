package com.mira;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//to call procedure using callable stmt
public class Callablestmt {

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
		
		//3.Create statement
		CallableStatement c=con.prepareCall("{call result(?,?)}");
		c.setInt(1, 5);
		c.setString(2, "D");
		
		
		
		//Execute Query
	    
		c.execute();
		System.out.println("Procedure is called.");
		
		//5.close
		con.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
