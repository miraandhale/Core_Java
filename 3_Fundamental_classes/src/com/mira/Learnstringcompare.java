package com.mira;

public class Learnstringcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="java";
		String str2="Java";
		String str4="java";
		
		String str3=new String("Java");
		
		boolean result=str1.equals(str2);//false
		System.out.println(result);
		
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		System.out.println(str2.equals(str3));//true
		
		//by == operator
		
		System.out.println(str2==str3);//false
		System.out.println(str1==str4);//true
		
		//compareTo() method
		
		String s1="Hello";
		String s2=new String("Hello");
		
		System.out.println(s1.compareTo(s2));//H is -2 position less than by J 
		
		Integer num1=new Integer(100);
		Integer num2=new Integer(20);
		
		System.out.println(num1.compareTo(num2));//-1
		
		System.out.println(s1.toUpperCase());
	}
	

}
