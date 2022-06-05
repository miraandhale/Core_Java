package com.mira;


class Vehicle//super class
{
	 int speed=65;
	void msg()
	{
		System.out.println("Car is vehicle..");
	}
	void info()
	{
		System.out.println("Alto");
	}
	Vehicle(String type)
	{
		System.out.println("Type:"+type);
	}
	
}

class Car extends Vehicle//sub class
{
	int speed=70;
	
	Car(int a,int b)
	{
		super("Fourwheeler");
		System.out.println(a);
		System.out.println(b);
	}
	void print()
	{
		super.speed=speed+1;
		System.out.println("speed:"+super.speed);
		super.msg();
		super.info();
	}
}


public class Learnsuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car(10,12);
		c.print();
	
		
	}

}
