package com.mira;

import java.io.FileReader;

//How we can use FileReader class 
public class LearnFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//create FileReader class
			
			FileReader f1=new FileReader("D:\\sample.txt");
			int i;//returns byte data
			while((i=f1.read())!=-1)//-1 end of your file
			{
			System.out.print((char)i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
