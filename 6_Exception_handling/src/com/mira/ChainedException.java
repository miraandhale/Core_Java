package com.mira;

import java.io.IOException;

public class ChainedException {

	static void divide(int a,int b)//a/b
	{
		if(b==0)
		{
			ArithmeticException ae=new ArithmeticException("RuntimeException");
			
			ae.initCause(new IOException("I/O error"));
			
			throw ae;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
		divide(100,0);
		
	}
catch(ArithmeticException e)
{
	System.out.println("Cause:"+e);
	System.out.println("actual cause:"+e.getCause());
}

}
	
}
