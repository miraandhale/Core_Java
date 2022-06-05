package com.mira;

abstract class Vehicle1//super class
{
	final String type="Twowheeler";
	static int a=10,b=20;
	abstract void speed(); //abstract method
	void info()
	{
		System.out.println("Type of Bike:"+type);
	}
	static void add()
	{
		int r=a+b;
		System.out.println("Addition of a and b "+r);
	}
}
class Bike1 extends Vehicle1
{
	int speed=70;
	void speed()
	{
		System.out.println("Speed:"+speed);
	}
	
	void print()
	{
		System.out.println("running....");
	}
}



public class Abstarctclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 b=new Bike1();
		b.speed();
		b.info();
		b.print();
		Bike1.add();
		
	}

}
