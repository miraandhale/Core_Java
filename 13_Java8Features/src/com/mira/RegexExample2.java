package com.mira;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abababab");
		while(m.find())
		{
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		
	}

}
