package com.mira;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
//Properties class to get all the system properties
public class TestProperties2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p=System.getProperties();  
		Set set=p.entrySet();  
		  
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
		Map.Entry entry=(Map.Entry)itr.next();  
		System.out.println(entry.getKey()+" = "+entry.getValue());  
		}  
	}

}

