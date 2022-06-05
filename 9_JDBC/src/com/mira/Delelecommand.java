package com.mira;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//to perform delete command using Java application
public class Delelecommand {

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
		PreparedStatement p=con.prepareStatement("delete from stud where rollno=4");
		
		
		
		//Execute Query
	     p.execute();
		
		System.out.println("Data deleted  successfully....");
		
		//5.close
		con.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
