package com.mira;

import java.io.FileWriter;

public class LearnFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileWriter fw=new FileWriter("D:\\sample.txt",true);
			
			fw.write("Licence Information:"+"\n"+"Licence Id:2121");
			System.out.println("data written successfully...");
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
