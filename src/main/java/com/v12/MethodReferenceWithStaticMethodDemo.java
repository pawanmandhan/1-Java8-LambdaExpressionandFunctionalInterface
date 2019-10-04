package com.v12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodReferenceWithStaticMethodDemo {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Runnable command = MethodReferenceWithStaticMethodDemo::myRun;
		executorService.execute(command);
	}

	private static void myRun() {
		System.out.println("My Task is running");
	}
}
