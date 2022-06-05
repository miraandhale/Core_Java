package com.mira;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str="Java is high level programming langauge.Java is robust programming langauge  ";

System.out.println(str.indexOf("is"));
System.out.println(str.indexOf("is", 10));
System.out.println(str.replace("Java", "Python"));
System.out.println(str);
System.out.println(str.trim());
System.out.println(str.substring(10));
System.out.println(str.substring(10, 15));//string from 10 to 14
System.out.println(str.length());


	}

}
