# v21 BiFunction Functional Interface | writing lambda for BiFunction Functional Interface


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
