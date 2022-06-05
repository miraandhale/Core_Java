package com.mira;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class LearnARM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try -resource stmt i.e ARM
		try(FileWriter fw=new FileWriter("D:\\sample.txt");)
		{
		
		fw.write("Licence Information:"+"\n"+"Licence Id:2121");
		System.out.println("data written successfully...");
		
		}
		catch(Exception e)
		{
			
		}
		
		
		try(FileReader f1=new FileReader("D:\\Sample.txt");
				BufferedReader b=new BufferedReader(f1))
		{
			
			String s;
			while((s=b.readLine())!=null)
			{
			System.out.println(s);
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}

