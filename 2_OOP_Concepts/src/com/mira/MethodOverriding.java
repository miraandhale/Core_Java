package com.mira;


class Bank//super class
{
	void getInterest(int rate)
	{
		System.out.println("Every bank has diffreent Rate of Interest");
	}
}
class Statebank extends Bank
{
	void getInterest(int rate)
	{
	   System.out.println("rate of interest of Statebank:"+rate);
	}
}

class ICICI extends Bank
{
	void getInterest(int rate)
	{
	   System.out.println("rate of interest of ICICI:"+rate);
	}
}

class Citybank extends Bank
{
	void getInterest(int rate)
	{
	   System.out.println("rate of interest of CityBank:"+rate);
	}
}



public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Statebank s=new Statebank();
		s.getInterest(9);
		ICICI i=new ICICI();
		i.getInterest(8);
		Citybank c=new Citybank();
		c.getInterest(7);
	}

}
