package com.ciq;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(1, "pradeep", 34456.00));
		e.add(new Employee(2, "swamy", 53456.00));
		e.add(new Employee(3, "ranjith", 55456.00));
		e.add(new Employee(4, "jithu", 765436.00));
		e.add(new Employee(5, "sai", 23456.00));
		e.add(new Employee(6, "pradeep", 5678.00));

		// Highest salary
		Employee ep = e.stream().max((o1, o2) -> (int) o1.getSalary() - (int) o2.getSalary()).get();
		System.out.println(ep);
		// Second highest salary
		e.stream().sorted((o1, o2) -> (int) o2.getSalary() - (int) o1.getSalary()).skip(1).limit(1)
				.collect(Collectors.toList()).forEach(System.out::println);
		// Least Salary
		Employee min = e.stream().min((o1, o2) -> (int) o1.getSalary() - (int) o2.getSalary()).get();
		System.out.println(min);

//	Convert list to map
		Map<Integer, String> m = e.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		System.out.println();
		
		//find name based first highest salary
		Employee e2=e.stream().filter((name)->name.name.equals("pradeep")).max((o1,o2) ->(int)o1.getSalary()-(int)o2.getSalary()).get();
		

	}

}
