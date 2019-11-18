# v26 Supplier FunctionalInterface | Writing Lambda for Supplier FunctionalInterface


 - Supplier is a FunctionalInterface.
 - Supplier<T> have T get() method.
 - Supplier 'T get()' method accepts zero argument & returns a result T.
 - Supplier is a FunctionalInterface, so we can use lambda expression for it.
 - Supplier represents Supplier of Results.
 - There is no requirement that a new or distinct result be returned each time the supplier is invoked.
 
````

@FunctionalInterface
public interface Supplier<T> {
    T get();
}

````
