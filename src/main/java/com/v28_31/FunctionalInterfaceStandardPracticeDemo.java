package com.v28_31;

import java.util.function.Function;

public class FunctionalInterfaceStandardPracticeDemo {

	public static void main(String[] args) {

		// 1
		Foo foo = s -> "Hello, " + s;
		UseFoo useFoo = new UseFoo();
		String result = useFoo.add("Raj", foo);
		System.out.println(result);

		// 2
		// If the requirements are fulfilled by existing FunctionalInterface
		// Instead of creating new Interface we should reuse existing
		// FunctionalInterface
		// declared in java.util.function package
		Function<String, String> func = s -> "Hello, " + s;
		result = useFoo.add("Rahul", func);
		System.out.println(result);

		System.out.println("----------------------------");
		// Function<String, String> function1 =s->s.toUpperCase();
		Function<String, String> function1 = String::toUpperCase;

		result = function1.apply("Sean");
		System.out.println(result);

		System.out.println("---------------------");

		new FunctionalInterfaceStandardPracticeDemo().method();
	}

	private void method() {
		final String localVariable = "Local";
		Function<String, String> fun = s -> {
			// String localVariable =s;
			return localVariable;
		};
		String result = fun.apply("KK");
		System.out.println(result);

	}

	private static String getFullName(String s1, String s2) {
		String firstName = s1.toUpperCase();
		String lastName = s2.toUpperCase();
		String result = firstName + "\t" + lastName;
		return result;
	}
}
