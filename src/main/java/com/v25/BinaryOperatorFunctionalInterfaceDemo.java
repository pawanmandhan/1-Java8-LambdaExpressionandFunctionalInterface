package com.v25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class BinaryOperatorFunctionalInterfaceDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "X");
		map.put("B", "Y");
		map.put("C", "Z");

		BinaryOperator<String> binaryOperator = (s1, s2) -> s1.concat(s2);
		binaryOperatorFunc(map, binaryOperator).forEach(System.out::println);
	}

	private static List<String> binaryOperatorFunc(Map<String, String> map, BinaryOperator<String> binaryOperator) {
		List<String> concatenatedLIst = new ArrayList<String>();
		map.forEach((s1, s2) -> concatenatedLIst.add(binaryOperator.apply(s1, s2)));
		return concatenatedLIst;
	}
}
