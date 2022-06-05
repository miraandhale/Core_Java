package com.mira;

public class LearnMultiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			
			String s="Hello";//index from 0 tom 5
			System.out.println(s.charAt(10));//exception
			
			String[] str1=new String[3];//index from 0 to 2
			str1[5]="A";//exception
			
			String str=null;
			System.out.println(str.length());//exception
			
			
			
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}

}
