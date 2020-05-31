package main.java.SecondDemo;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

    public static void main(String[] args) {

        /*
        Interface Supplier<T>
        Type Parameters:
        T - the type of results supplied by this supplier
        Represents a supplier of results.
        It takes no argument and returns a result
         */

        getText(() -> "This is Sagar here"); // () is zero argument

    }

    public static void getText(Supplier<String> text){
        System.out.println(text.get());
    }
}
