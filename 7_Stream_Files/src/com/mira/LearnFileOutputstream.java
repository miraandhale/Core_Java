package com.mira;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class LearnFileOutputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		FileOutputStream obj=new FileOutputStream("D:\\sample.txt");//created byte ouputstream file

		String s="Java programming";
		
		byte b[]=s.getBytes();
		obj.write(b);
		
		obj.close();
		System.out.println("Data has been writeen successfully");
		}
		catch(Exception e)
		{
			
		}
	}

}
