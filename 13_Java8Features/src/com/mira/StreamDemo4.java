package com.mira;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emp_list=new ArrayList<Employee>();
		
		emp_list.add(new Employee(1,"A","active",20000,"Management"));
		emp_list.add(new Employee(2,"B","inactive",45000,"Accountant"));
		emp_list.add(new Employee(4,"C","active",50000,"Technical"));
		emp_list.add(new Employee(101,"D","active",30000,"HR"));
		emp_list.add(new Employee(7,"E","active",40000,"HR"));
		
		//to print emp details based on dept
		
		Map<String,List<Employee>> emplistbasedondept=emp_list.stream().collect(Collectors.groupingBy(Employee::getdept));
		
		emplistbasedondept.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+":"+entry.getValue());
		});
		
		//number of employee based on each dept
		Map<String, Long> empcountdept=emp_list.stream().collect(Collectors.groupingBy(Employee::getdept,Collectors.counting()));
		empcountdept.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+":"+entry.getValue());
		});
		
	}

}
