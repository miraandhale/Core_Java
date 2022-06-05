package com.mira;

public class LearnMathclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x=10.9999;
		double y=2;
		
		System.out.println("maximum between two numbers:"+Math.max(x, y));
		System.out.println(Math.sqrt(x));
		System.out.println(Math.pow(x, y));//x^y
		System.out.println(Math.log(x));
		
		double result=Math.sqrt(x);
		System.out.println("square root of x:"+result);
		System.out.println(Math.exp(x));//E=2.71828(E^X)
		
		
 //System.out.println("without digit of exponetial value:"+Math.round(result));
		
//converting values into radian to perform trignometric function
 
          
 double r=Math.toRadians(x);
 System.out.println(Math.sin(r));
 
		
	}

}
