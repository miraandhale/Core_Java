package com.mira;

public class Calculator {

	//addiiton task
	public int add(int a,int b)
	{
		return a+b;
	}
	
	//substraction task
     public int sub(int a,int b)
	{
		return a-b;
	}
	
	//multiplication task
	public int mult(int a,int b)
	{
		return a*b;
	}
	
	//division task
	public int div(int a,int b)
	{
		return a/b;
	}

	public int max(int[] n)
	{
		int temp=n[0];
		for(int i=1;i<n.length;i++)
		{
			if(temp<n[i])
			{
				temp=n[i];
			}
		}
		return temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c=new Calculator();
		c.add(10, 20);
		c.mult(3, 4);
		c.div(60, 2);
		c.sub(100, 50);
	}

}
