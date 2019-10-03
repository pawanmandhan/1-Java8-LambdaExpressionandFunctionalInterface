# v8 Iterate Collection Using ForEach

 - Collection extends Iterable<I>.
 - Iterables have a forEach(Consumer<? super T> action) method.
 - Iterable's forEach() is a default method.
 - Iterable's forEach() takes Consumer type as an argument.

````

public interface Iterable<T> {
   
    default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }
}

````

 - Consumer is a FunctionalInterface.
 - Consumer<T> have void accept(T t) method.
 - Consumer's accept(T t) method consumes 1 arguments. (performs some action on 1 arguments & returns nothing)

````

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}

````
