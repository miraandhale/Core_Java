package com.mira;


public class Learnconstructor {
	
	//declaring default constructor
     Learnconstructor()
	{
		System.out.println("Welcome");
	}

     
     //declaring parametrized constructor
     Learnconstructor(int a,int b)
     {
    	 int r=a+b;
    	 System.out.println(r);
     }
     
     Learnconstructor(float a,int b)
     {
    	 float r=a+b; 
    	 System.out.println(r);
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learnconstructor obj1=new Learnconstructor();//default constructor
		Learnconstructor obj2=new Learnconstructor(10,50);//parametrized constructor
		
		
	}
	static
	{
		System.out.println("hello");
	}
	static
	{
		System.out.println("java");
	}

}
