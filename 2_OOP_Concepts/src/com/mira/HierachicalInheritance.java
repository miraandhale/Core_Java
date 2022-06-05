package com.mira;


class A1//super class
{
	void print()
	{
		System.out.println("A");
	}
}
class B1 extends A1
{
	void msg()
	{
		System.out.println("B");
	}
	
}
class C1 extends A1
{
	void display()
	{
		System.out.println("C");
	}
}

class D1 extends A1
{
	void info()
	{
		System.out.println("D");
	}
}
public class HierachicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1 obj1=new B1();
		obj1.msg();
		
		C1 obj2=new C1();
		obj2.display();
		
		D1 obj3=new D1();
		obj3.info();
		
		obj1.print();
	}

}
