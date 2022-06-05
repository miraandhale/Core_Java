package com.mira;

class Employee1
{
	int emp_id;
	String name;
	//declaring parametrized constructor to provide the values for instance variable
	Employee1(int emp_id,String name)
	{
		
		this();
		this.emp_id=emp_id;
		this.name=name;
		
	}
	Employee1()
	{
		this("Good");
		System.out.println("Default cosntructor");
	}
	
	Employee1(String msg)
	{
		System.out.println(msg);
	}
	void get()
	{
		System.out.println("hello");
	}
	void display()
	{
		System.out.println("Finish...");
	}
	void print()
	{
		this.get();
		this.display();
		System.out.println("Employee Id:"+emp_id);
		System.out.println("Employee Name:"+name);
	}



}


public class Learnthismethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//creating 5 object
		Employee1 e1=new Employee1(1,"A");
		Employee1 e2=new Employee1(2,"B");
		Employee1 e3=new Employee1(3,"C");
		Employee1 e4=new Employee1(4,"D");
		Employee1 e5=new Employee1(5,"E");
		
		//display 5 employee information
				e1.print();
				e2.print();
				e3.print();
				e4.print();
				e5.print();
				
	}

}
