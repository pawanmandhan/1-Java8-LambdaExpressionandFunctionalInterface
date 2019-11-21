package com.v37;

import java.util.function.Function;

public class Function_compose_andThen_identityDemo {
	public static void main(String[] args) {
		Function<String, String> function = i -> "Hello " + i;
		Function<String, String> salutation = i -> "Mr. " + i.toUpperCase();

		System.out.println(function.compose(salutation).apply("Pawan"));// Hello Mr. PAWAN
		
		System.out.println(function.andThen(salutation).apply("Pawan"));// Mr. HELLO PAWAN
		
		System.out.println(Function.identity().apply(1));// 1
	}
}
