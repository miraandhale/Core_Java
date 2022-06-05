package com.mira;

public class LearnRethrowing {
static void m()
{
	
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			String s="Java";
			System.out.println(s.charAt(10));//exception
		}
		catch(StringIndexOutOfBoundsException e)
		{
		System.out.println(e);	
		throw e;//re-throwing exception
		}
	}

}

