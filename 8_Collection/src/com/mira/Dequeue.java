package com.mira;

import java.util.ArrayDeque;

//implement deque Ds using ArrayDeque
public class Dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<Integer> a=new ArrayDeque<Integer>();
		a.add(23);
		a.add(45);
		a.add(26);
		a.add(90);
		a.add(100);
		a.add(34);
		
		a.addFirst(89);
		a.addLast(78);
		a.addLast(67);
		
		//a.removeFirst();
		//a.removeLast();
		
		System.out.println("head of q:"+a.peekFirst());
        System.out.println("tail of q:"+a.peekLast());
		System.out.println("traversing");
		for(Integer p:a)
		{
			System.out.println(p);
		}
	}

}
