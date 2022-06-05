package com.mira;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	transient int rollno;//can not be serilized
	String name;
	static String collegename="XYZ";
	
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	
	
	
}

public class TestSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      { 
		Student s=new Student(1,"ABC");
		
		//serialization
		FileOutputStream f1=new FileOutputStream("D:\\serilizable.txt");
		ObjectOutputStream obj=new ObjectOutputStream(f1);
		
		obj.writeObject(s);
		
		System.out.println("Data has been successfully serialized");
		
		obj.close();
		
		//Deserilization
		FileInputStream f2=new FileInputStream("D:\\serilizable.txt");
		ObjectInputStream obj1=new ObjectInputStream(f2);
		
		Student s1=(Student) obj1.readObject();
		
		System.out.println(s1.name);
	
	   }
          catch(Exception e)
          {
	
             }

}
}
