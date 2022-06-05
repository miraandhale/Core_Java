package com.mira;

import java.io.IOException;

public class LearnThrows {
	
	 void A() throws IOException
	{
		throw new IOException("Device Error");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnThrows obj=new LearnThrows();
		
		try
		{ 
			obj.A();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
