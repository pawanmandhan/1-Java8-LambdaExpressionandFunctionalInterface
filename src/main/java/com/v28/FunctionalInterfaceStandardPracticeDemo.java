package com.v28;

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
		// Instead of creating new Interface we should reuse existing FunctionalInterface
		// declared in java.util.function package
		Function<String, String> func = s -> "Hello, " + s;
		result = useFoo.add("Rahul", func);
		System.out.println(result);
	}
}
