package com.mira;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class LearnVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> a2=new Vector<Integer>();
		a2.add(4);
		a2.add(5);
		a2.add(34);
		a2.add(56);
		a2.add(56);
		
		a2.remove(0);
	
		
		Vector<Integer> a3=new Vector<Integer>();//second arraylist
		a3.add(67);
		a3.add(90);
		a3.addAll(a2);
		
		
		Collections.sort(a3);
		
		
		System.out.println("traversing elements of Vector class");
		
		//By enhanced for loop
		for(Integer i1:a3)
		{
			System.out.println(i1);
		}
	}

}
