package com.mira;

import java.util.HashSet;

//implment Set interface using HashSet class
public class LearnhashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> h=new HashSet<Integer>();
		h.add(23);
		h.add(23);
		h.add(3);
		h.add(2);
		h.add(200);
		h.add(100);
		h.add(null);
		
		h.remove(23);
		System.out.println("traversing");
		for(Integer p:h)
		{
			System.out.println(p);
		}
		
	}

}
