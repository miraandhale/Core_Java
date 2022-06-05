package com.mira;
/**
 * count() method that can be used 
 * to know the number of elements in the stream. 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<Integer>();  
    numbers.add(100);
    numbers.add(110);
    numbers.add(120);
    numbers.add(150);
    System.out.println(numbers);
    
    /*Stream<Integer> s = numbers.stream();//creates stream elements
    long count = s.count(); //Terminal operation
    System.out.println("Total Values = "+count);*/
    
    long numberofobject=numbers.stream().count();
    System.out.println(numberofobject);
    
}
}
