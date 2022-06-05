package com.mira;

public class LearnEnum {

	public enum Season
	{
		WINTER,SUMMER,RAINY
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//traversing a enum elements
		for(Season s:Season.values())
		{
			System.out.println(s);
		}
	}

}
