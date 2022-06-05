package com.mira;

import java.io.Console;

public class LearnConsoleclass {

	public static void main(String[] args) {
		
		// Create a reference to the console.	
		     Console c = System.console();   

		// Checking the console is available or not. 
		     if(c != null) {
		             System.out.printf("Console is available.");	 
		     } else{
			     System.out.printf("console is not available");
		       return;
		  }
		  System.out.println("Enter your password: ");    
		  char[ ] ch = c.readPassword(); // Reading password.
		  
		  String pass = String.valueOf(ch);// Converting an array of char into string    
		  System.out.println("Password is: "+pass); 
		  }
		}