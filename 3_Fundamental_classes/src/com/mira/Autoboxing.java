package com.mira;


public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;//a is int primitive type
		
		//convert int a into Float class object
		
		Float s=(float) a;
		
		Character x=(char) a;
		
		Integer obj2=Integer.valueOf(a);//old way
		
		Integer obj=a;//autoboxing process internally it perform 
		               //Integer.valueOf(a)
		
		float b=4.0f;
		
		Float obj1=b;
		
		//unboxing
		
		Integer i=new Integer(10);
		
		//converting i into int primitive type
		int a2=i.intValue();//old way
		
		int a1=i;//unboxing internally perform i.intValue();
		
		Float j=new Float(4.0f);
		
		float a3=j;//j.floatvalue()
		
		//converting j object of Float class as short primitive type
		
        
		
		//understand toString method with Wrapper class
		
		Integer l=new Integer(10);
		String str=l.toString();//l object is string formate
		
		String s1=str+"java";
		
		System.out.println(s1);
	}

}
