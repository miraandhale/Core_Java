package com.mira;

/**
 * We can use the stream to filter Collection elements. 
 * Here, we are using the filter() method and 
 * collecting the result as a list. 
 * The filter() method takes a lambda expression as an argument.
 */

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;
	public class StreamDemo1 {
		public static void main(String[] args){
			
			List<Integer> numbers = new ArrayList<Integer>();  
	        numbers.add(100);
	        numbers.add(110);
	        numbers.add(120);
	        numbers.add(150);
	        
	        List<Integer> newlist =numbers.stream()  //ArrayList elements is stream elements
	                                      .filter(n->n>110)////Intermediate operation
	                                      .collect(Collectors.toList());//terminal operation
	        System.out.println(newlist);  
		}
	}
