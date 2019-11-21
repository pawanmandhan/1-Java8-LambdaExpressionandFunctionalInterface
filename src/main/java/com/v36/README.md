# v36 BiPredicate and,or and negate example


 - BiPredicate is a FunctionalInterface.
 - BiPredicate<T, U> have boolean test(T t, U u) method.
 - BiPredicate 'boolean test(T t, U u)' method accepts 2 arguments & returns a boolean result. 
 
````

@FunctionalInterface
public interface BiPredicate<T, U, R> {
    boolean test(T t, U u);
}

````


 - **and()** is a default method in BiPredicate FunctionalInterface
 - Returns a composed predicate that represents a short-circuiting logical AND of this predicate(first BiPredicate) and another(second BiPredicate). 
 - When evaluating the composed predicate, if this(first BiPredicate) predicate is  false, then the other (second BiPredicate) predicate is not evaluated.
 - Any exceptions thrown during evaluation of either predicate are relayed to the caller; if evaluation of this(first predicate) predicate throws an exception, the other(second predicate) predicate will not be evaluated.

````

default BiPredicate<T, U> and(BiPredicate<? super T, ? super U> other) {
    Objects.requireNonNull(other);
    return (T t, U u) -> test(t, u) && other.test(t, u);
}
````

 - **negate()** is a default method in BiPredicate FunctionalInterface
 - Returns a predicate that represents the logical negation of this predicate.
````

default BiPredicate<T, U> negate() {
    return (T t, U u) -> !test(t, u);
}
````

 - **or()** is a default method in BiPredicate FunctionalInterface
 - Returns a composed predicate that represents a short-circuiting logical OR of this(first BiPredicate) predicate and another(second BiPredicate). 
 - When evaluating the composed predicate, if this(first BiPredicate) predicate is  true, then the other(second BiPredicate) predicate is not evaluated.
 - Any exceptions thrown during evaluation of either predicate are relayed to the caller; if evaluation of this(first predicate) predicate throws an exception, the other(second predicate) predicate will not be evaluated.

````

default BiPredicate<T, U> or(BiPredicate<? super T, ? super U> other) {
    Objects.requireNonNull(other);
    return (T t, U u) -> test(t, u) || other.test(t, u);
}
````


- Example
````

BiPredicate<Integer, Integer> biPredicate1 = (x, y) -> x > y;
BiPredicate<Integer, Integer> biPredicate2 = (x, y) -> x - 2 > y;

System.out.println(biPredicate1.and(biPredicate2).test(20, 15));//true
System.out.println(biPredicate1.and(biPredicate2).test(10, 8));//false

System.out.println("------------------------------------------");
System.out.println(biPredicate1.or(biPredicate2).test(10, 15));//false
System.out.println(biPredicate1.or(biPredicate2).test(15, 8));//true
	
System.out.println("------------------------------------------");
System.out.println(biPredicate1.negate().test(20, 15));//false

````

- outputs 
````
true
false
------------------------------------------
false
true
------------------------------------------
false
````
