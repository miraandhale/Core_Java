package com.mira;
/**
 * we passed a method reference in the forEach() method 
 * to print the stream result.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {
public static void main(String[] args) {
	

	List<Integer> numbers = new ArrayList<Integer>();  
    numbers.add(100);
    numbers.add(110);
    numbers.add(120);
    numbers.add(150);
    
    Stream<Integer> stream = numbers.stream();//List elements became stream elements
    //traversing element using stream by functional approach
    stream.forEach(System.out::println); //terminal operation
}
}