package com.mira;

import java.util.Date;

public class Employee {

	private int emp_id;
	private String name;
	private int salary;
	private String status="active";
	private String dept;
	private Date joining_date;
	
	public Employee(int emp_id,String name,String status,int salary,String dept)
	{
		this.emp_id=emp_id;
		this.name=name;
		this.status=status;
		this.salary=salary;
		this.dept=dept;
		
	}
	
	public void setEmp_id(int emp_id)
	{
		this.emp_id=emp_id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	
	public int getEmpId()
	{
		return emp_id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	
	public String getdept()
	{
		return dept;
	}
	public String toString()
	{
		return emp_id+" "+name+" "+status+" "+salary+" "+dept+" ";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
