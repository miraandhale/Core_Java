package com.mira;

import java.util.Collections;
import java.util.LinkedList;

//implement list interface using LinkedList class
public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> l=new LinkedList<String>();
		l.add("Red");
		l.add("yellow");
		l.add("black");
		l.add("pink");
		l.add("Red");
		
		l.remove("Red");
		
		Collections.sort(l);
		System.out.println("traversing elements of linkedlist class");
		
		for(String s:l)
		{
			System.out.println(s);
		}
	}

}
