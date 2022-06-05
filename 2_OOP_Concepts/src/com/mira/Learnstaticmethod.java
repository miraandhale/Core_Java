package com.mira;

public class Learnstaticmethod {
	
	
	//declaring static method
	
	static int a,b;
	static void add()
	{
		int r=a+b;
		System.out.println(r);
		
	}
	 
	static void sub()
	{
		int r=a-b;
		System.out.println(r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
		sub();
	}
	
	static
	
	{
		a=20;
		b=30;
		System.out.println("welcome");
	}

}
