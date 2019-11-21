# v32 BiConsumer andThen example


 - BiConsumer is a FunctionalInterface.
 - BiConsumer<T, U> have void accept(T t, U u) method.
 - BiConsumer's accept(T t, U u) method consumes 2 arguments. 
 - (performs some action on 2 arguments & returns nothing)
    
````

@FunctionalInterface
public interface BiConsumer<T, U> {
    void accept(T t, U u);
}

````

 - andThen() is a default method in BiConsumer FunctionalInterface
 - Returns a composed BiConsumer that performs, in sequence, this(first BiConsumer) operation followed by the after(second BiConsumer) operation.
 - If performing either operation throws an exception, it is relayed to the caller of the composed operation.
 - If performing this(first BiConsumer) operation throws an exception, the after(second BiConsumer) operation will not be performed.
 
````
default BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> after) {
   Objects.requireNonNull(after);

   return (l, r) -> {
      accept(l, r);
      after.accept(l, r);
   };
}
````



- Example
````

BiConsumer<Integer, Integer> adder = (i1, i2) -> System.out.println("Adder : " + (i1 + i2));
BiConsumer<Integer, Integer> multiplier = (i1, i2) -> System.out.println("Multiplier : " + (i1 * i2));
		
adder.andThen(multiplier).accept(30, 50);

````

- outputs 
````

-Adder : 80
-Multiplier : 1500

````