# v10 Comparator Impl Using Lambda Expression

 - Collections class have sort(List<T> list, Comparator<? super T> c) method.
 - All methods in Collections re static.

````

public class Collections {
    public static <T> void sort(List<T> list, Comparator<? super T> c) {
        list.sort(c);
    }
}

````
 
 - Comparator is a FunctionalInterface.
 - Comparator<T> have int compare(T o1, T o2) method.
 
````

@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);
}

````
