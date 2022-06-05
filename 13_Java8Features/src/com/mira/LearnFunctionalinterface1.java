package com.mira;

//implementing functional interface using lamda expression


interface Printable
{
	void print();
}


public class LearnFunctionalinterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//lamda expression
		Printable obj=()->System.out.println("Printing");
		obj.print();
		
	}

}
