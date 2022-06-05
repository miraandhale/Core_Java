package com.mira;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//implement Map Interface using HashMap class
public class LearnHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creates HashMap
		
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
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
		
		Set s=h1.entrySet();
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{  
		Entry e=(Entry) itr.next();
		System.out.println(e.getKey()+" :"+ e.getValue()); 
		}
		
		//for loop
		
		for(Entry<Integer, String> m:h1.entrySet())
		{
			System.out.println(m.getKey()+" :"+ m.getValue()); 
		}
		
		
	}

}
