package com.mira;

import java.io.File;
import java.io.IOException;

//how to create a file in Java
public class LearnFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			//create file class
			File f1=new File("D:\\Sample.txt");
			if(f1.createNewFile())
			{
				System.out.println("file is created");
			}
			else
			{
				System.out.println("File is not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}