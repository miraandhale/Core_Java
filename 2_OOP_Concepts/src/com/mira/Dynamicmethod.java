package com.mira;


//implement Runtime polymorphism or Dynamic method dispatch

class Bank1//super class
{
	void getInterest(int rate)
	{
		System.out.println("Every bank has diffreent Rate of Interest");
	}
}
class Statebank1 extends Bank1
{
	void getInterest(int rate)
	{
	   System.out.println("rate of interest of Statebank:"+rate);
	}
}

class ICICI1 extends Bank1
{
	void getInterest(int rate)
	{
	   System.out.println("rate of interest of ICICI:"+rate);
	}
}

class Citybank1 extends Bank1
{
	void getInterest(int rate)
	{
	   System.out.println("rate of interest of CityBank:"+rate);
	}
}



public class Dynamicmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank1 b1=new Statebank1();
		b1.getInterest(9);
		Bank1 b2=new ICICI1();
		b2.getInterest(8);
		Bank1 b3=new Citybank1();
		b3.getInterest(7);
	}

}
