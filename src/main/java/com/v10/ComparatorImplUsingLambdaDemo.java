package com.v10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorImplUsingLambdaDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Sean", "sean.m@gmail.com", 90000.00));
		empList.add(new Employee("Andrew", "andy.cs@gmail.com", 70000.00));
		empList.add(new Employee("Martin", "martin.m300@gmail.com", 80000.00));
		
		System.out.println("List of employee before sorting..");
		empList.forEach(System.out::println);
		
//		System.out.println("-------------------Using EmployeeComparator-------------------------");
//		Collections.sort(empList, new EmployeeComparator());

		
		System.out.println("-------------------Using Anonymous Class-------------------------");
/*		Collections.sort(empList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
*/	
		System.out.println("-------------------Using Lambda Expression-------------------------");
		Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));
		
		System.out.println("--------------------------------------------");
		System.out.println("List of employee after sorting..");
		empList.forEach(System.out::println);
		
	
	}
}
