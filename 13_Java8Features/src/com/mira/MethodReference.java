package com.mira;


//implemeting functional interface using method refrence

interface A
{
	void get();//abstract method
}


public class MethodReference {

	//implementation of get() i.e abstract  method
	 void print()
	{
		System.out.println("printing");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodReference obj=new  MethodReference();
		//method reference
		
		A obj1= obj :: print;
		
		obj1.get();
		
		
		
	}

}
