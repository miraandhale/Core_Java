package com.mira;

import java.util.LinkedList;

//implement Queue Ds using LinkedList class
public class TestLinkedlist2 {

	public static void main(String[] args) {
	
	// TODO Auto-generated method stub
		
		LinkedList<String> l=new LinkedList<String>();
		l.offer("A");
		l.offer("B");
		l.offer("C");
		l.offer("D");
		l.offer("R");
		
		
		l.removeFirst();
		l.removeFirst();
		
		System.out.println("traversing");
		for(String p:l)
		{
			System.out.println(p);
		}

	}

}
