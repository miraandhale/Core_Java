package com.mira;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringMapList {

	private List<String> list;
	private Map<String, String> map;
	
	public StringMapList(){
		list=new ArrayList<>();
		map = new HashMap<>();
	}
	// add data to list and map
	public void add(String key, String value) {
		list.add(value);
		map.put(key, value);		
	}
	//read data from map
	public String get(String key) {
			return map.get(key);
	}
	//read data from list
	public String get(int i) {
		String value =null;
		int maxlength = list.size();//find out size of arraylist
		if (i >=0 && i < maxlength){
			value =list.get(i);
		}
		return value;
	}
	//
	public Object getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	public void remove(String key) {
		String value = map.get(key);
		map.remove(key);
		/*
		 *key=A-->removed
		 *removed A form arraylist
		 */
		list.remove(value);
		
	}

	public void remove(int i) {
		String value = list.get(i);
		String keytoberemoved = null;
		for(String key : map.keySet()){
			if(value == map.get(key)){
				keytoberemoved = key;
				break;
			}
		}
		map.remove(keytoberemoved);
		list.remove(i);
	}

}
