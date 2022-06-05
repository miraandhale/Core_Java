package com.mira;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try//outer try
		{
			
			try
			{
				String s="Hello";//index from 0 tom 5
				System.out.println(s.charAt(10));//exception
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
			try
			{
				String[] str1=new String[3];//index from 0 to 2
				str1[5]="A";//exception
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
			try
			{
				String str=null;
				System.out.println(str.length());//exception
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			
		}
		
		catch(ArithmeticException e)//outer catch
		{
			System.out.println(e);
		}
	}

}
