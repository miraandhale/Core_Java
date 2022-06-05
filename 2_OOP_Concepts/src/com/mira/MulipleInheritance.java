package com.mira;


class A//super class1
{
	void print()
	{
		System.out.println("A");
	}
}

class B//super class 2
{
	void print()
	{
		System.out.println("B");
	}
}

class C extends A,B
{
	
	
}

public class MulipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C obj=new C();
		obj.print();
		obj.print();

	}

}
