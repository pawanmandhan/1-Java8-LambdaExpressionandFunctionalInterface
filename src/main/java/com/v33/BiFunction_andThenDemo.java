package com.v33;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction_andThenDemo {
	public static void main(String[] args) {

		BiFunction<String, Integer, Integer> salaryBiFunction = 
				(role,age) -> (role.equalsIgnoreCase("Manager") && age > 28) ? 50000 : 35000;

		Function<Integer, String> jobLevel = salary -> (salary >= 50000) ? "JOB LEVEL 6" : "JOB LEVEL 4";

		String result = salaryBiFunction.andThen(jobLevel).apply("Manager", 40);
		System.out.println(result);

		result = salaryBiFunction.andThen(jobLevel).apply("Manager", 20);
		System.out.println(result);

	}
}
