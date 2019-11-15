package com.v23;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionFunctionalInterfaceDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("raj", 20));
		list.add(new Student("raju", 40));
		list.add(new Student("rahul", 30));
		for (Student student : list) {
			System.out.println(student.customShow(s -> s.getName() + ", " + s.getAge()));
		}

		// storing lambda expression in a local variable and passing it where
		// needed.
		Function<Student, String> otherWay = s -> s.getName() + ", " + s.getAge();

		for (Student student : list) {
			System.out.println(student.customShow(otherWay));
		}
	}
}
