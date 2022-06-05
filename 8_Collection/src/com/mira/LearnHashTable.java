package com.mira;

import java.util.Hashtable;
import java.util.Map;

public class LearnHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> h1=new Hashtable<Integer,String>();
		h1.put(1,"Red");
		h1.put(11,"Yellow");
		h1.put(100,"Yellow");
		h1.put(21,"Yellow");
		h1.put(16,"Purple");
		h1.put(15, "Purple");
		
		
		//for loop
		
			for(Map.Entry<Integer, String> m:h1.entrySet())
				{
					System.out.println(m.getKey()+" :"+ m.getValue()); 
				}
		
	}

}
