package com.mira;

import java.util.ArrayDeque;

//implement Queue DS Using ArrayDeque class
public class ArrayDq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<Integer>  a=new ArrayDeque<Integer>();
		a.offer(34);
		a.offer(56);
		a.offer(6);
		a.offer(46);
		a.offer(69);
		a.offer(60);
		
		a.removeFirst();
		a.removeFirst();
		
		
		System.out.println("traversing");
		for(Integer p:a)
		{
			System.out.println(p);
		}
	}

}
