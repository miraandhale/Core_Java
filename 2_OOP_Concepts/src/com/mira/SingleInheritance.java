package com.mira;

//Single Inheritance

class Employee2//super class
{
	
	float salary=50000.0f;
	Employee2()
	{
		System.out.println("constructor of super class");
	}
	Employee2(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	static void get()
	{
		System.out.println("static method..");
	}
}
class Programmer extends Employee2//sub class
{
	int bonus=10000;
	Programmer()
	{
		super(12,34);
		System.out.println("constructor of sub class");
		
	}
	void print()
	{
		System.out.println("Salary:"+salary);
		System.out.println("Bonus of programmer:"+bonus);
	}
}



public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Programmer p=new Programmer();
		p.print();
		Programmer.get();
	}

}
