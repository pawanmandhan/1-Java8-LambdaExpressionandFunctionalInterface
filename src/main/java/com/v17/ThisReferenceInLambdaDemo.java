package com.v17;

public class ThisReferenceInLambdaDemo {

	public void process() {
		doPerate(30, n -> {
			System.out.println(30 + n);
			System.out.println(this);
			//can reference this from lamda from instance method com.v17.ThisReferenceInLambdaDemo@34414
		});
	}

	public static void main(String[] args) {
		int b = 90;

		ThisReferenceInLambdaDemo.doPerate(b, new Operation() {
			@Override
			public void operate(int n) {
				System.out.println(b + n);
				System.out.println(this);
				//this refers to object of Anonymous inner class com.v17.ThisReferenceInLambdaDemo$1@34414
			}
		});

		ThisReferenceInLambdaDemo.doPerate(b, n -> {
			System.out.println(b + n);
			// System.out.println(this); 
			// can't reference this from Lamda as main is static
		});
		
		new ThisReferenceInLambdaDemo().process();
	}

	private static void doPerate(int i, Operation o) {
		o.operate(i);
	}
}
