package com.mira;

import java.util.ArrayList;
import java.util.Collections;

//Perform user defined objects into arrayList class

class Student implements Comparable<Student>
{
	int rollno;
	String name;
	
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}

	@Override
	public int compareTo(Student s) {
		if(rollno==s.rollno)
		{
			return 0;
		}
		else if(rollno>s.rollno)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
}


public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(100,"A");
		Student s2=new Student(12,"B");
		Student s3=new Student(300,"C");
		
		ArrayList<Student> a=new ArrayList<Student>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		
		Collections.sort(a);
		
		System.out.println("Sorting on the basis of Rollno");
		for(Student i1:a)
		{
			System.out.println(i1.rollno+" "+i1.name );
		}

	}

}
