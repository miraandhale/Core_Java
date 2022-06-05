package com.mira;

//implementation of Properties class to store the key and value in to the properties file
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Testproperties3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties p=new Properties();  
		p.setProperty("name","Mira Andhale");  
		p.setProperty("email","mira_andhale@persistent.com");  
		  
		try {
			FileWriter fw=new FileWriter("D:\\info.properties");
			p.store(fw,"User information");
			System.out.println("Data store successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		  
	}

}
	