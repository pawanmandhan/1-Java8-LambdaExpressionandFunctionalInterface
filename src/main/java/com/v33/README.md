# v33 BiFunction andThen example


 - BiFunction is a FunctionalInterface.
 - BiFunction<T, U> have R apply(T t, U u) method.
 - BiFunction 'R apply(T t, U u)' method accepts 2 arguments & returns a value(result R). 
 - applies business logic on 2 arguments & returns a result.
 
````

@FunctionalInterface
public interface BiFunction<T, U, R> {
    R apply(T t, U u);
}

````

 - andThen() is a default method in BiFunction FunctionalInterface
 - Returns a composed function that first applies this(first BiFunction) function to its input, and then applies the after(second Function) function to the result.
- If evaluation of either function throws an exception, it is relayed to
the caller of the composed function.

````
default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t, U u) -> after.apply(apply(t, u));
}
````

- Example
````

BiFunction<String, Integer, Integer> salaryBiFunction = 
				(role,age) -> (role.equalsIgnoreCase("Manager") && age > 28) ? 50000 : 35000;

Function<Integer, String> jobLevel = salary -> (salary >= 50000) ? "JOB LEVEL 6" : "JOB LEVEL 4";

String result = salaryBiFunction.andThen(jobLevel).apply("Manager", 40);
System.out.println(result);

result = salaryBiFunction.andThen(jobLevel).apply("Manager", 20);
System.out.println(result);

````

- outputs 
````

- JOB LEVEL 6
- JOB LEVEL 4
````
