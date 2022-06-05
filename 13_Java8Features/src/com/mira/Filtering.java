package com.mira;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> a=new ArrayList<Integer>();
		a.add(101);
		a.add(8);
		a.add(10);
		a.add(3);
		a.add(90);
		
		//List<Integer> evenlist=new ArrayList<Integer>();
		
		//without stream
		/*for(Integer n:a)
		{
			if(n%2==0)
			{
				evenlist.add(n);
			}
		}
		System.out.println(evenlist);*/
		
		//with stream(from jdk 1.8)
		//filter stream
		
		//evenlist=a.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		//System.out.println(evenlist);
		
		//sorted stream
		//evenlist=a.stream().sorted().collect(Collectors.toList());
		
		//System.err.println(evenlist);
		
		//a.stream().filter(b->b%2==0).forEach(g->System.out.println(g));
		
		a.stream().filter(b->b%2==0).forEach(System.out::println);
		

	}

}
