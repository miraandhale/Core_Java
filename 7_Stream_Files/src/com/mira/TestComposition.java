package com.mira;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Engine implements Serializable
{
	String engine_type;
	Engine(String engine_type)
	{
		this.engine_type=engine_type;
		
	}
}

class Car1 implements Serializable
{
	private final String car_name;
   private final Engine obj;//composition
	
	Car1(String car_name,Engine obj)
	{
		this.car_name=car_name;
		this.obj=obj;
	}
	
	
	
}

public class TestComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			   Engine d=new Engine("Petrol");
			   Car1 d1=new Car1("Alto",d);
				

				//serialization
				FileOutputStream f1=new FileOutputStream("D:\\serilizable.txt");
				ObjectOutputStream obj=new ObjectOutputStream(f1);
				
				obj.writeObject(d1);
				
				System.out.println("Data has been successfully serialized");
				
				obj.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
