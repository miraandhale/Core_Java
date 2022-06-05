package com.mira;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

class Employee
{
	int emp_id;
	String name;
	double salary;
	
	Employee(int emp_id,String name,double salary)
	{
		this.emp_id=emp_id;
		this.name=name;
		this.salary=salary;
	}
	
	
}


public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> t=new ArrayList<Employee>();
		t.add(new Employee(1,"Devid",3000.0));
		t.add(new Employee(6,"Alexender",10000.0));
		t.add(new Employee(3,"Jack",15000.0));
		
		Collections.sort(t, new Sortbyemp_id());
	
		
		System.out.println("Traversing after sorting on the basis of emp_id");
		
		for(Employee e:t)
		{
			System.out.println(e.emp_id+" "+e.name+" "+e.salary);
		}
		
		Collections.sort(t, new Sortbyname());
	
        System.out.println("Traversing after sorting on the basis of name");
		
		for(Employee e:t)
		{
			System.out.println(e.emp_id+" "+e.name+" "+e.salary);
		}
		
		
	}

}
