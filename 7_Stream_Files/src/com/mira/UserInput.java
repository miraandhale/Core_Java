package com.mira;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//read the data from console or accept the data from a user
public class UserInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(ir);
		
		System.out.println("enter the name");
		String str=b.readLine();//read the data line by line from console
		System.out.println("Name:"+str);
	}

}
