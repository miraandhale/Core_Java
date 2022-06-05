package com.mira;


//implement copy constructor
public class Number {
	
	int a=10;
	int b=20;
	
	
	Number()
	{
		
	}
	//declaring copy const.
	Number(Number n)
	{
		a=n.a;
		b=n.b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating object
		Number n=new Number();
		//printing a values of a and b
		
		System.out.println("A:"+n.a);
		System.out.println("B:"+n.b);
		
		///Now we are updating the values of a and b
		n.a=50;
		n.b=40;
		
		System.out.println("After updating values:");
		System.out.println("A:"+n.a);
		System.out.println("B:"+n.b);
		
		//creating new object
		Number n1=new Number();
		
		//we will not get updated values by new object
		System.out.println("Not getting updated values:");
		System.out.println("A:"+n1.a);
		System.out.println("B:"+n1.b);
		
		//declaring copy constructor object
		Number n2=new Number(n);
		
		//we will get updated values using copy constructor object
		System.out.println("Getting updated values:");
		System.out.println("A:"+n2.a);
		System.out.println("B:"+n2.b);
		
		
		
	}

}
