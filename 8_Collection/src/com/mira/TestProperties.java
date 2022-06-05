package com.mira;

import java.util.*;  
import java.io.*;  

//Properties class to get information from the properties file
	public class TestProperties {
	public static void main(String[] args)throws Exception{  
		
		File f1=new File("D:\\sample.properties");
		if(f1.createNewFile())
		{
			System.out.println("file is created");
		}
		else
		{
			System.out.println("File is not created");
		}
	    FileReader reader=new FileReader(f1);  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password")); 
	}  
	}
	
