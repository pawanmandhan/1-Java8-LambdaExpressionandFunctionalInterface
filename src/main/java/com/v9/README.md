# v9 Iterate Map Using ForEach

 - Map have a forEach(BiConsumer<? super K, ? super V> action) method.
 - Map's forEach() is a default method.
 - Map's forEach() takes BiConsumer type as an argument.

````

public interface Map<K,V> {
   
   default void forEach(BiConsumer<? super K, ? super V> action) {
        Objects.requireNonNull(action);
        for (Map.Entry<K, V> entry : entrySet()) {
            K k;
            V v;
            try {
                k = entry.getKey();
                v = entry.getValue();
            } catch(IllegalStateException ise) {
                // this usually means the entry is no longer in the map.
                throw new ConcurrentModificationException(ise);
            }
            action.accept(k, v);
        }
    }
}

````
 
 - BiConsumer is a FunctionalInterface.
 - BiConsumer<T, U> have void accept(T t, U u) method.
 - BiConsumer's accept(T t, U u) method consumes 2 arguments. (performs some action on 2 arguments & returns nothing)
 
````

@FunctionalInterface
public interface BiConsumer<T, U> {
    void accept(T t, U u);
}

````
