package com.v27;

import java.util.function.BooleanSupplier;

public class BooleanSupplierFunctionalInterfaceDemo {
	public static void main(String[] args) {
		BooleanSupplier booleanSupplier = () -> true;
		System.out.println(booleanSupplier.getAsBoolean());

		int x = 9;
		int y = 10;
		booleanSupplier = () -> x > y;
		System.out.println(booleanSupplier.getAsBoolean());

	}
}
