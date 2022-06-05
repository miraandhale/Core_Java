package com.mira;

public class ExceptionPropagation {
	void a()
	{
		int a=100/0;//exception
	}
	void b()
	{
		a();
	}

	void c()
	{
		try
		{
			b();
		}
		catch(Exception e)
		{
			System.out.println("can not divide by zero");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionPropagation obj=new ExceptionPropagation();
		obj.c();
	}

}
