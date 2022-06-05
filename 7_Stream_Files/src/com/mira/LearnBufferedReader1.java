package com.mira;

import java.io.BufferedReader;
import java.io.FileReader;

//read the data from a file using BuffredReader class

public class LearnBufferedReader1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileReader in=new FileReader("D:\\Sample.txt");
			BufferedReader b=new BufferedReader(in);
			
			int i;//returns byte data
			while((i=b.read())!=-1)//-1 end of your file
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
