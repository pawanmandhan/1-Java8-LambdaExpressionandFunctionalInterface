# v34 BinaryOperator minBy and maxBy example


 - BinaryOperator is a FunctionalInterface.
 - BinaryOperator<T> extends BiFunction<T,T,T>.
 - BinaryOperator<T> doesn't have any other abstract method than T apply(T t,T u).
 - BinaryOperator<T> have T apply(T t, T u) method.
 - BinaryOperator 'T apply(T t,T u)' method accepts 2 argument & returns a result T.
 - BinaryOperator is a FunctionalInterface, so we can use lambda expression for it.
 - BinaryOperator is used to work on the single operand. It returns the same type as an operand.
 
````

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T,T,T> {
    T apply(T t,T u);
}

````

