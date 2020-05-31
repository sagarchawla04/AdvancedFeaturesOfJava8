package main.java.SecondDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

    public static void main(String[] args) {
        /*
        Interface Predicate<T>
        Represents a predicate (boolean-valued function) of one argument.
        This is a functional interface whose functional method is test(Object).
         */

        Predicate<Integer> func = x -> x>5;
        System.out.println(func.test(10)); // True

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> asList = list.stream().filter(x -> x> 5).collect(Collectors.toList());
        System.out.println(asList); // [6, 7, 8, 9]

        // Predicate with && operator
        List<Integer> asList1=  list.stream().filter(x -> x > 5 && x < 9).collect(Collectors.toList());
        System.out.println(asList1); // [6, 7, 8]

        //Predicate with Negate()
        List<String> newlist = Arrays.asList("Sagar","Saga","Sag","Java","Jav");
        List<String> asList2 = newlist.stream().filter(x -> x.startsWith("Sag")).collect(Collectors.toList());
        System.out.println(asList2); //[Sagar, Saga, Sag]

        Predicate<String> namesExp = x -> x.startsWith("Sag");
        List<String> asList3 = newlist.stream().filter(namesExp.negate()).collect(Collectors.toList());
        System.out.println(asList3); //[Java, Jav]

    }
}
