package com.v21;

import java.util.function.BiFunction;

public class BiFunctionFunctionalInterfaceDemo {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> biFunction = (n1, n2) -> "result : " + (n1 + n2);
		System.out.println(biFunction.apply(100, 200));
	}
}
