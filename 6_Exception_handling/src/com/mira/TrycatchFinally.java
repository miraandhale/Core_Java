package com.mira;

//try -catch- finally
public class TrycatchFinally {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] a=new int[5];//internally it creates index from 0 to 4
			
			a[6]=30;//exception
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("rest of code...");
		}
		
	}

}
