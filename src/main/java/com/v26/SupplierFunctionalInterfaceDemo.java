package com.v26;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionalInterfaceDemo {
	public static void main(String[] args) {
		Supplier<Integer> supplier = SupplierFunctionalInterfaceDemo::getNum;

		for (int i = 0; i < 20; i++) {
			System.out.println(supplier.get());
		}
	}

	private static Integer getNum() {
		Random random = new Random();
		return random.nextInt(100);
	}
}
