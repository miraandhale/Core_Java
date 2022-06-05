package com.mira;

import java.util.LinkedList;

//implement Stack DS using LinkedList class
public class TestLinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> a=new LinkedList<Integer>();
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


