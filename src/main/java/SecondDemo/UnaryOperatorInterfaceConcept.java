package main.java.SecondDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

    public static void main(String[] args) {

        /*
        Interface UnaryOperator<T>
        Represents an operation on a single operand that produces a result of the same type as its operand.
        This is a specialization of Function for the case where the operand and result are of the same type.
        It extends function interface
        @FunctionalInterface
        public interface UnaryOperator<T>
        extends Function<T,T>
        */

        UnaryOperator<Integer> func = x -> x * 7;
        int n1 = func.apply(10);
        System.out.println(n1); //70

        List<String> langList = new ArrayList<>();
        langList.add("Java");
        langList.add("Ruby");
        langList.add("Python");

        System.out.println(langList); //[Java, Ruby, Python]

        langList.replaceAll(ele -> ele + " Sagar");
        System.out.println(langList); //[Java Sagar, Ruby Sagar, Python Sagar]

    }
}
