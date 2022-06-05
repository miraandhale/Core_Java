package com.mira;

import java.util.Collections;
import java.util.PriorityQueue;

public class LearnPriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		p.offer(1);
		p.offer(3);
		p.offer(11);
		p.offer(10);
		p.offer(67);
		p.offer(45);
		
		
	    System.out.println("head of q:"+p.peek());
	    
	    //p.remove(10);
	    
	   
		
		System.out.println("traversing");
		for(Integer a:p)
		{
			System.out.println(a);
		}
		
	}

}
