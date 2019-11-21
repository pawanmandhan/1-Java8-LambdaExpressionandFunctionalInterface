# v37 Function compose(),andThen() and identity() example


![alt text](https://github.com/pawanmandhan/1-Java8-LambdaExpressionandFunctionalInterface/blob/master/img/v1/Functional%20Interface-New%20Features_PART1-1.png?raw=true)

![alt text](https://github.com/pawanmandhan/1-Java8-LambdaExpressionandFunctionalInterface/blob/master/img/v1/Functional%20Interface-New%20Features_PART1-2.png?raw=true)


- **compose()** returns a composed function that first applies the before(second Function) function to its input, and then applies this(first Function) function to the result.
- If evaluation of either function throws an exception, it is relayed to the caller of the composed function.

````

default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
    Objects.requireNonNull(before);
    return (V v) -> apply(before.apply(v));
}

````

- **andThen()** returns a composed function that first applies this(First Function) function to its input, and then applies the after(second Function) function to the result.
- If evaluation of either function throws an exception, it is relayed to the caller of the composed function.

````

default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
}
````

- **identity()** returns a function that always returns its input argument.
- identity() is a static method.
````
static <T> Function<T, T> identity() {
    return t -> t;
}
````

- Example


````

Function<String, String> function = i -> "Hello " + i;
Function<String, String> salutation = i -> "Mr. " + i.toUpperCase();

System.out.println(function.compose(salutation).apply("Pawan"));// Hello Mr. PAWAN
		
System.out.println(function.andThen(salutation).apply("Pawan"));// Mr. HELLO PAWAN
	
System.out.println(Function.identity().apply(1));// 1

````