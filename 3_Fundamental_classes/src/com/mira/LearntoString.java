package com.mira;


class Student
{
	int rollno;
	String name;
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	
	public String toString()
	{
		return rollno+" "+ name;
	}
	
}
public class LearntoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student(1,"X");
		System.out.println("Rollno and name:"+s);//object is represnted as string
	}

}
