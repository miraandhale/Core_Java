package com.mira;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

//implement List interface using ArrayList class
public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create arraylist class
		
		
		ArrayList<Integer> a2=new ArrayList<Integer>();//Generic collection
		a2.add(4);
		a2.add(5);
		a2.add(34);
		a2.add(56);
		a2.add(56);
		System.out.println(a2);
		a2.remove(3);
		System.out.println(a2);
		
	
		
		ArrayList<Integer> a3=new ArrayList<Integer>();//second arraylist
		a3.add(67);
		a3.add(90);
		a3.addAll(a2);
		
		a3.add(0, 100);
		
		Collections.sort(a3);//is to sort elements of arraylist(ascending oder)
		
		System.out.println("After adding one arraylist into another arryalist");
		System.out.println("traversing elements of ArrayList class");
		
		//By iterator interface
		
		Iterator<Integer> i=a2.iterator();//interator object maintain the cursor
		//hasnext()--->checkes whether next elements is available or not
		//next()--->moves the cursor to the next elements and also it return the elements.
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		
		
		//By enhanced for loop
		for(Integer i1:a3)
		{
			System.out.println(i1);
		}
		//By ListIterator interface used to iterate the only list interface or its classes

		ListIterator<Integer> a=a2.listIterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
			
		}
		
		int size=a2.size();
		System.out.println("Size "+size);
		//Backword direction traversing using ListIterator
		System.out.println("Backward direction");
		ListIterator<Integer> l=a2.listIterator(a2.size());
		//hasPrevious()-->checks wheter previous ele is avilable or not
		//previous()-->moves cursor to the previous elem and also returns elem
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		
		//by using forEach()
		
		a2.forEach(u->
		{
			System.out.println(u);
		});//lamda expression*/
		
		//forEachReamining method
		
		Iterator i3=a2.iterator();
		
	
		i3.forEachRemaining(x->{
			System.out.println(x);
		});
			
		}
	
	

}
