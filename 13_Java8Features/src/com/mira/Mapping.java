package com.mira;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l=new ArrayList<String>();
		l.add("Car");
		l.add("Bicycle");
		l.add("Train");
		l.add("Truck");
		
		//List<String>  elementsinuppercase=new ArrayList<String>();
		
		
		// elementsinuppercase=l.stream().map(z->z.toUpperCase()).collect(Collectors.toList());
		 
		
		 //System.out.println( elementsinuppercase);
		
		l.stream().map(z->z.toUpperCase()).forEach(h->System.out.println(h));
	}

}
