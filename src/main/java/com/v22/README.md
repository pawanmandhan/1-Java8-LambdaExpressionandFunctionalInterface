# v22 BiPredicate FunctionalInterface | Writing Lambda for BiPredicate


 - BiPredicate is a FunctionalInterface.
 - BiPredicate<T, U> have boolean test(T t, U u) method.
 - BiPredicate 'boolean test(T t, U u)' method accepts 2 arguments & returns a boolean result. 
 
````

@FunctionalInterface
public interface BiPredicate<T, U, R> {
    boolean test(T t, U u);
}

````
