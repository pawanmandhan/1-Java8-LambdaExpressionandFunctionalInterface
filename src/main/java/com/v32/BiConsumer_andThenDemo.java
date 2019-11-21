package com.v32;

import java.util.function.BiConsumer;

public class BiConsumer_andThenDemo {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> adder = (i1, i2) -> System.out.println("Adder : " + (i1 + i2));
		BiConsumer<Integer, Integer> multiplier = (i1, i2) -> System.out.println("Multiplier : " + (i1 * i2));
		
		adder.andThen(multiplier).accept(30, 50);
		multiplier.andThen(adder).accept(40, 20);
	}

}
