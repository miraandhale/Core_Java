package com.mira;

import java.io.File;
import java.io.IOException;

public class practice {
	
		public static void main(String[] args){
			
			try {
				File f1=new File("D:\\Sample1.txt");	
				if(f1.createNewFile())
				{
					System.out.println("File is created");
				}
				else {
					System.out.println("File is not created");
				}
				
			} catch(IOException e)
			{
				e.printStackTrace();
			}
				
			
		}
		
}