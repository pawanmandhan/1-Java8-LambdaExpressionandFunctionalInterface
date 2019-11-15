package com.v24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorFunctionalInterfaceDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		UnaryOperator<Integer> unaryOperator = i -> i * i;
 		unaryOperatorFunc(list, unaryOperator).forEach(System.out::println);
	}

	// returns a new list which contains square of elements
	private static List<Integer> unaryOperatorFunc(List<Integer> list, UnaryOperator<Integer> unaryOperator) {
		List<Integer> squaredList = new ArrayList<Integer>();
		list.forEach(i -> squaredList.add(unaryOperator.apply(i)));
		return squaredList;
	}

}
