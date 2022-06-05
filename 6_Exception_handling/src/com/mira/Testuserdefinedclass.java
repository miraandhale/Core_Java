package com.mira;

public class Testuserdefinedclass {
	
	static void validate(int age) throws VotingHandler
	{
		if(age<18)
		{
			throw new VotingHandler("not eligible for voting...");
		}
		else
		{
			System.out.println("eligible for voting");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			validate(19);
		} catch (VotingHandler e) {
			
			e.printStackTrace();
		}
	}

}
