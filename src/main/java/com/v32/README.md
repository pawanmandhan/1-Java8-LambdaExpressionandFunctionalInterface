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
