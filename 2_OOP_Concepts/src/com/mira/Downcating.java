package com.mira;

class Fruit
{
	void category()
	{
		System.out.println("Fruit");
	}
}
class Apple extends Fruit
{
	void color()
	
	{
		System.out.println("Red");
	}
}


public class Downcating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Apple a=(Apple) new Fruit();//will thow runtime exception bcz we
		//directly provided downcasting
		
		Fruit f=new Fruit();//create object of super class
		Apple a1=(Apple)f;//downcating
		a1.category();
		a1.color();
	}

}
