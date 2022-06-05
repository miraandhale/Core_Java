package com.mira;

public class MethodOverloading {
	
	int result;
	void add(int a,int b)
	{
		result=a+b;
		System.out.println("Addition of two int numbers:"+result);
	}
	void add(int a,int b,int c)//changing number of arguments
	{
		result=a+b+c;
		System.out.println("Addition of three int numbers:"+result);
	}
	void add(float a,int b)//changing the data type
	{
		float result=a+b;
		System.out.println("Addition of one int and one float:"+result);
	}
	void add(float a,float b)
	{
		float r=a+b;
		System.out.println("Addition of two float numbers:"+r);
	}
	float add(float a,float b,float c)
	{
		return a+b+c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.add(12, 34);
		obj.add(1.2f, 3.2f);
		System.out.println(obj.add(1.0f, 2.0f, 3.0f));
		obj.add(100, 200, 300);
		obj.add(1.0f, 300);
		
	}

}
