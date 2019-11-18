package com.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		// createThreadUsingAnonymousClass();
		// createThreadUsingLambdaExpression();

		List<String> nameList = new ArrayList<>();
		nameList.add("Andrew");
		nameList.add("Sean");
		nameList.add("Rocky");

		// nameList.forEach((name)-> System.out.println(name));
		nameList.forEach(System.out::println);

	}

	private static void createThreadUsingLambdaExpression() {
		Runnable r = () -> {
			System.out.println("My task is executing..");
		};
		Thread thread = new Thread(r);
		thread.start();
	}

	private static void createThreadUsingAnonymousClass() {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("My task is executing..");
			}
		};

		Thread thread = new Thread(r);
		thread.start();
	}
}
