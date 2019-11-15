package com.v22;

import java.util.function.BiPredicate;

public class BiPredicateFunctionalInterfaceDemo {

	public static void main(String[] args) {
		BiPredicate<String, String> biPredicate = (i1, i2) -> i1.equals(i2);
		System.out.println(biPredicate.test("hi", "hi"));
		System.out.println(biPredicate.test("hi", "hllo"));
	}

}
