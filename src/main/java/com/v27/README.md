# v27 BooleanSupplier FunctionalInterface | Writing Lambda for BooleanSupplier FunctionalInterface


 - BooleanSupplier is a FunctionalInterface.
 - BooleanSupplier have boolean getAsBoolean() method.
 - BooleanSupplier 'boolean getAsBoolean()' method accepts zero argument & returns a boolean result.
 - BooleanSupplier is a FunctionalInterface, so we can use lambda expression for it.
 - BooleanSupplier represents Supplier of boolean-valued Results.
 - There is no requirement that a new or distinct result be returned each time the supplier is invoked.
 
````

@FunctionalInterface
public interface BooleanSupplier {
    boolean getAsBoolean();
}

````
