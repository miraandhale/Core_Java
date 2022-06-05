package com.mira;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable
{
	String category;
	Animal(String category)
	{
		this.category=category;
	}
	
}

class Dog extends Animal 
{
	String color;
	
	Dog(String category,String color)
	{
		super(category);
		this.category=category;
		this.color=color;
	}
	
}


public class TestSerialization2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
try
{
		Dog d=new Dog("Domestic Animal","Red");
		

		//serialization
		FileOutputStream f1=new FileOutputStream("D:serilizable.txt");
		ObjectOutputStream obj=new ObjectOutputStream(f1);
		
		obj.writeObject(d);
		
		System.out.println("Data has been successfully serialized");
		
		obj.close();
}
catch(Exception e)
{
	
}
		
	}

}
