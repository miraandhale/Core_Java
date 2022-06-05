package com.mira;

public class Stringbufferclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a string using StringBuffer class
		
		StringBuffer str=new StringBuffer("Java");
		str.append("programming language");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		//str.setCharAt(0, 'P');
		//System.out.println(str);
		System.out.println(str.insert(0, "Hello"));
		System.out.println(str.delete(0, 5));
		System.out.println(str.reverse());
		
		StringBuilder str1=new StringBuilder("Java");
		str1.append(b);
		
	}

}
