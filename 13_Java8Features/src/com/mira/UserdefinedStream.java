package com.mira;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class UserdefinedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emp_list=new LinkedList<Employee>();
		emp_list.add(new Employee(1,"A","active",20000,"Management"));
		emp_list.add(new Employee(2,"B","inactive",45000,"Technical"));
		emp_list.add(new Employee(4,"C","active",50000,"Technical"));
		emp_list.add(new Employee(101,"D","active",30000,"HR"));
		emp_list.add(new Employee(7,"E","active",40000,"HR"));
		
		
		Map<String,List<Employee>> emplistbasedondept=new LinkedHashMap<String,List<Employee>>();
		
		//System.out.println(emp_list);
		
		//to print emp details based on dept
		
		emplistbasedondept=emp_list.stream().collect(Collectors.groupingBy(Employee::getdept));
		
		//System.out.println(emplistbasedondept);
	
		//to count employee of respective dept
		
		//Map<String, Long> emptcountondept=emp_list.stream().collect(Collectors.groupingBy(Employee::getdept,Collectors.counting()));
		//System.out.println(emptcountondept);
		
		
		//to print employee who's salary maximum  and mimimum
		//Object max_salary=emp_list.stream().max(Comparator.comparing(Employee::getSalary));
		//System.out.println(max_salary);
		
		//Object min_salary=emp_list.stream().min(Comparator.comparing(Employee::getSalary));
		//System.out.println("Employee who's salary:"+min_salary);
		
		//to print employee who's salry is maximum from dept
	Map<String, Optional<Employee>> employeemaxsalrybasesondept=emp_list.stream().collect(Collectors.groupingBy(Employee::getdept,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		
		System.out.println("\n"+employeemaxsalrybasesondept);
	}

}
