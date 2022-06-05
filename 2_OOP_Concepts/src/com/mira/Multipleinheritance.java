package com.mira;
//implement Multiple inheritance using interface

interface A2//super interface1
{
	int a=1;
	void get(int a);
}
interface B2 //super interface 2
{
	void get();
}
class C2 implements A2,B2
{

	@Override
	public void get(int a) {
		// TODO Auto-generated method stub
		System.out.println("A");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
	System.out.println("B");	
	}
	
}

public class Multipleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C2 obj=new C2();
		
		obj.get(10);
		obj.get();
	}

}
