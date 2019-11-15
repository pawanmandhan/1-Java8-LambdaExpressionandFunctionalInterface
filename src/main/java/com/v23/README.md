# v23 Function FunctionalInterface | Writing Lambda for Function FunctionalInterface


 - Function is a FunctionalInterface.
 - Function<T, R> have R apply(T t) method.
 - Function 'R apply(T t)' method accepts 1 argument & returns a result R.
 - Function is a FunctionalInterface, so we can use lambda expression for it.
````

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}

````
