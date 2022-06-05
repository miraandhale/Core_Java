package com.mira;

import java.util.Stack;

//implement Stack DS using Stack class
public class LearnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s=new Stack<Integer>();//creates empty stack
		//push operation
		
		s.push(1);
		s.push(11);
		s.push(21);
		s.push(10);
		s.push(41);
		
		
		//pop
		
		s.pop();
		s.pop();
		
		System.out.println("Iterating elements of stack");
		
		for(Integer i:s)
		{
			System.out.println(i);
		}

	}

}
