package com.mira;

//Multilevel Inheritance
 class Animal//super class
{
	String category="Domestic Animal";
	void print()
	{
		System.out.println("Category:"+category);
	}
	Animal(String name)
	{
		System.out.println("Name:"+name);
	}
	
}
class Dog extends Animal//sub class 1
{
	Dog(String type)
	{
		super("Domestic:");
		System.out.println("Type:"+type);
		
	}
	
	void bark()
	{
		System.out.println("Barking..");
	}
	
}

class BabyDog extends Dog//sub class-2
{
	BabyDog ()
	{
		super("XYZ");
	}
	
	void weep()
	{
		System.out.println("weeping........");
	}
}


public class MulilevelInheritance 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog b=new BabyDog ();
		b.print();
		b.bark();
		b.weep();
	}

}
