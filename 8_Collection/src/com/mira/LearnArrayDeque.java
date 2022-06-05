package com.mira;

import java.util.ArrayDeque;

//implement stack ds using ArrayDeque
public class LearnArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<Integer> a=new ArrayDeque<Integer>();
		//push operation
		a.push(10);
		a.push(11);
		a.push(145);
		a.push(210);
		a.push(100);
		
		
		//pop
		a.pop();
		a.pop();
		System.out.println("traversing");
		for(Integer p:a)
		{
			System.out.println(p);
		}
	}

}
