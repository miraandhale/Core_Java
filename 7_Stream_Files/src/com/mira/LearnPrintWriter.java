package com.mira;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LearnPrintWriter {

	public static void main(String[] args) throws IOException {
		
			// Data to write on Console using PrintWriter class.
			// Create an object of PrintWriter class using System.out.
			     PrintWriter pw = new PrintWriter(System.out);    
			     
			    pw.write("java programming language....");        
			    pw.flush();  
			    
			 
			// Data to write in File using PrintWriter class.    
			     FileWriter obj=new FileWriter("D:\\sample.txt");
			     PrintWriter pw2 = new PrintWriter(obj);  
			     pw2.write("Welcome");
			     pw2.append(" Java");
			     System.out.println("\n"+"Data has been written successfully..");
			      pw2.close();  
			 }
			}