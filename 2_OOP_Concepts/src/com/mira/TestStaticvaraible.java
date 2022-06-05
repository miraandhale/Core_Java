package com.mira;

class Student
{
	int rollno;
	String name;
    static String college_name="KPIT";//memory will allocates only one time
	
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
		
	
	}
	void print()
	{	
		System.out.println("Rollno:"+rollno);
		System.out.println("Student name:"+name);
		System.out.println("CollgeName:"+college_name);
	}
	
}



public class TestStaticvaraible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student(1,"A");
		Student s2=new Student(2,"B");
		Student s3=new Student(3,"C");
		
		s1.print();
		s2.print();
		s3.print();
		
	}

}
