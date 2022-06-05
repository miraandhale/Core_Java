package com.mira;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//to perform insert command using Java application
public class InsertCommand {

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
		//insert query
		PreparedStatement p=con.prepareStatement("insert into stud values(?,?)");
		p.setInt(1, 3);
		p.setString(2, "C");
		
		
		//Execute Query
	     p.execute();
		
		System.out.println("Data inserted successfully....");
		
		//5.close
		con.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
