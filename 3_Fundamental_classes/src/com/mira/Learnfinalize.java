package com.mira;

public class Learnfinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learnfinalize obj=new Learnfinalize();
		System.out.println("class of obj:"+obj.getClass());
		System.out.println(obj.hashCode());//I have used the object
	
		
		obj=null;
		//destroy the object
		//calling garbage collector
		
		System.gc();
		
		System.out.println("Object is destroyed");
		
		
		
	}
	
	
	protected void finalize()
	{
		System.out.println("finalize method is called..");
	}

}
