# v8 Iterate Collection Using ForEach

 - Collection extends Iterable<I>.
 - Iterables have a forEach(Consumer<? super T> action) method.

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

 - BiConsumer is a FunctionalInterface.
 - Consumer<I> have void accept(T t) method.

````

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);
}

````
