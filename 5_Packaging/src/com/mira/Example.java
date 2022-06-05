package com.mira;

import java.lang.System;

import java.lang.*;

class A
{
	protected int a=1;
	protected void get()//default method
	{
		System.out.println(a);
	}
}

public class Example extends A
{
	
	 int b=10;
	
	void print()
	{
		get();
		System.out.println(a);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
	}

}

