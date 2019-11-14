# v18_19 Handling Unchecked Exceptions in Lambda Expression Demo

````
    List<Integer> list = Arrays.asList(10, 0, 30, 40, 50);

		// this code doesn't handle any exception in Lambda Expression
		// list.forEach(i -> System.out.println(50 / i));

		// here exception handling is done in a way that conciseness of the
		// lambda expression is lost
		// & its no longer as it was supposed to be.
		list.forEach(i -> {
			try {
				System.out.println(50 / i);
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException occured" + e.getMessage());
			}
		});

		// instead of handling exception inside lambda we can create a lambda
		// wrapper separately lambdaWrapper()
		list.forEach(lambdaWrapper(i -> System.out.println(50 / i)));

````

````  
  // a generic wrapper implementation consumerWrapper()
		list.forEach(consumerWrapper(i -> System.out.println(50 / i), Exception.class));

	private static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException occured" + e.getMessage());
			}
		};
	}
````

````
	private static <T, E extends Exception> Consumer<T> consumerWrapper(Consumer<T> consumer, Class<E> clazz) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException occured" + e.getMessage());
			}
		};
	}

````
