package com.mira;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streamdemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*List<Integer> l=new ArrayList<Integer>();
		l.add(101);
		l.add(111);
		l.add(102);
		l.add(200);
		l.add(193);
		l.add(1);*/
		
        List<Integer> a=Arrays.asList(8,2,4,6,10);
        //filter even number
        
        List<Integer> evenlist=new ArrayList<Integer>();
        
        
        //without using stream
        for(int n:a)
        {
        	if(n%2==0)
        	{
        		evenlist.add(n);
        	}
        }
        System.out.println(evenlist);
        
        //with stream
        
        evenlist=a.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenlist);
        
        List<Integer> sorted=a.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);
        
        long count=a.stream().count();
        System.out.println(count);
        
         Set<Boolean> value = a.stream().map(n->n%2==0).collect(Collectors.toSet());
         System.out.println(value);
		
	}

}
