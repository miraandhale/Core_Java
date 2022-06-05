package com.mira;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//perform batch updates
public class BatchProcessing {

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
		Statement st=con.createStatement();
		
		st.addBatch("Select * from stud");
		st.addBatch("insert into stud values(7,'F')");
		st.addBatch("delete from stud where rollno=1");
		st.addBatch("update stud set rollno=1 where name='B'" );
		
		//4.execute Query
		
		st.executeBatch();
		
		System.out.println("batch updated");
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
