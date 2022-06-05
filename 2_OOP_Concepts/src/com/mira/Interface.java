package com.mira;

interface Shape
{
	final static int a=3;
	final int b=8;
	default void get1()
	{
		System.out.println("default method");
	}
	static void print()
	{
		System.out.println(a);
	}
	void get();//abstract method
}
class Circle implements Shape
{
	void info()
	{
		System.out.println("Circle shape");
	}

	
	public void get() {
		System.out.println("Drwaing...");
		
	}
}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c=new Circle();
		c.get();
		Shape.print();
		c.info();
		c.get1();
	}

}
