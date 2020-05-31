package main.java.SecondDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

    public static void main(String[] args) {

        /*
        Interface Consumer<T>
        Represents an operation that accepts a single input argument and returns no result.
        Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
         */

        Consumer<String> func = x -> System.out.println(x);
        func.accept("This is my code"); // This is my code

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.forEach(x -> System.out.println(x)); // It will print complete length
    }
}
