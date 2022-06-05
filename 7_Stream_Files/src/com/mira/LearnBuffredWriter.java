package com.mira;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class LearnBuffredWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileWriter obj=new FileWriter("D:\\sample.txt",true);
			BufferedWriter b=new BufferedWriter(obj);
			b.append("Welcome");
			//b.write("Welcome");
			System.out.println("data written successfully");
			b.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
