package com.mira;

interface Bird//super interface
{
	default void get()
	{
		System.out.println("Flying birds");
	}
	void info();
}

interface Parrot extends Bird
{
	default void print()
	{
		System.out.println("Parrot bird");
	}
}

class Subclass implements Parrot
{
	public void info()
	{
		System.out.println("eating");
	}
}
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subclass c=new Subclass();
		c.get();
		c.print();
		c.info();
	}

}
