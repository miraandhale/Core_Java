package com.mira;

//this can be used to refer current instance variable of a class
class Employee
{
	int emp_id;
	String name;

	void get(int emp_id,String name )
	{
		this.emp_id=emp_id;
		this.name=name;
	}
	void print()
	{
		
		System.out.println("Employee Id:"+emp_id);
		System.out.println("Employee Name:"+name);
	}
	
}



public class Learnthis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating 5 object
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		Employee e5=new Employee();
		
		//get 5 employee information
		e1.get(1,"A");
		e2.get(2,"B");
		e3.get(3,"C");
		e4.get(4,"D");
		e5.get(5,"E");
		
		//display 5 employee information
		e1.print();
		e2.print();
		e3.print();
		e4.print();
		e5.print();
		
		
		
		
	}

}
