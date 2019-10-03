# v9 Iterate Map Using ForEach

 - Map have a forEach(BiConsumer<? super K, ? super V> action) method.

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
 
````

@FunctionalInterface
public interface BiConsumer<T, U> {

    void accept(T t, U u);
}

````
