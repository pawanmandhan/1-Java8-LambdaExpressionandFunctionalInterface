# v24 UnaryOperator FunctionalInterface | Writing Lambda for UnaryOperator FunctionalInterface


 - UnaryOperator is a FunctionalInterface.
 - UnaryOperator<T> extends Function<T,T>.
 - UnaryOperator<T> doesn't have any other abstract method than R apply(T t).
 - UnaryOperator<T> have R apply(T t) method.
 - UnaryOperator 'R apply(T t)' method accepts 1 argument & returns a result R.
 - UnaryOperator is a FunctionalInterface, so we can use lambda expression for it.
 - UnaryOperator is used to work on the single operand. It returns the same type as an operand.
 
````

@FunctionalInterface
public interface UnaryOperator<T> extends Function<T,T> {
    R apply(T t);
}

````
