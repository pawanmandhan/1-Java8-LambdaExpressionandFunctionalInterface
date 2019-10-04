package com.v16;

public class ClosuresinLambdaExpressionsDemo {

	public static void main(String[] args) {

		int x = 30;
		int y = 40;
		/*
		 * doPerate(x, new Operation() {
		 * 
		 * @Override public void operate(int n) { // y=300; can't change y here
		 * // Local variable y defined in an enclosing scope must be final // or
		 * effectively final System.out.println(n + y); } });
		 */
		doPerate(x, n -> System.out.println(n + y));
	}

	private static void doPerate(int i, Operation o) {
		o.operate(i);
	}
}
