package com.v20;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterfaceDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");

		BiConsumer<Integer, String> action = (k, v) -> System.out.println("key: " + k + ", value: " + v);
		map.forEach(action);
	}
}
