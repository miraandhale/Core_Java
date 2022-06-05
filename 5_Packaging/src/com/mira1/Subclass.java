package com.mira1;

import com.mira.Example;

public class Subclass extends Example
{

	void print()
	{
		get();
		System.out.println("a:"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass obj = new Subclass();
		obj.print();

	}

}
