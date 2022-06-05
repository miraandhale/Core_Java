package com.mira;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class LearnFileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		
		{
			FileInputStream f=new FileInputStream("D:\\Training\\.classpath");
			BufferedInputStream b=new BufferedInputStream(f);
			int i;
			while((i=b.read())!=-1)
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
