package com.mira;

public class LearnThrow {

	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not eligible for voting");
		}
		else
		{
			System.out.println("Eligible for voting....");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		validate(17);
	}

}
