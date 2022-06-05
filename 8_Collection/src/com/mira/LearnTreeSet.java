package com.mira;

import java.util.Iterator;
import java.util.TreeSet;

//implements Set using TreeSet class
public class LearnTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> i=new TreeSet<Integer>();
		i.add(23);
		i.add(20);
		i.add(12);
		i.add(6);
		i.add(3);
		
         System.out.println("root node of tree:"+i.headSet(20));
		i.remove(20);
		System.out.println("traversing");
		System.out.println("Ascending order");
		for(Integer p:i)
		{
			System.out.println(p);
		}
		System.out.println("Descending order of tree elements");
		//descending order
		Iterator<Integer> d=i.descendingIterator();
		while(d.hasNext())
		{
			System.out.println(d.next());
		}

	}

}
