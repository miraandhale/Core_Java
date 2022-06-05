package com.mira;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//implement Map Interface using LinkedHashMap class
public class LearnLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer,String> h1=new LinkedHashMap<Integer,String>();
		h1.put(1,"Red");
		h1.put(11,"Yellow");
		h1.put(100,"Yellow");
		h1.put(21,"Yellow");
		h1.put(15,"White");
		h1.put(null, "Purple");
		h1.put(67,null);
		h1.put(90, null);
		
		h1.putIfAbsent(45, "Black");
		
		h1.replace(21, "Yellow", "Pink");
		
		h1.remove(1);
		
		System.out.println("Iterating elements of Hash MAp");
		
		//we need to convert Map into set
		
		//for loop
		
		for(Map.Entry<Integer, String> m:h1.entrySet())
		{
			System.out.println(m.getKey()+" :"+ m.getValue()); 
		}
		
		
	}

}
