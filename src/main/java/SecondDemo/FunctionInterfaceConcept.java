package main.java.SecondDemo;

import java.util.function.Function;

public class FunctionInterfaceConcept {

    public static void main(String[] args) {

        /*Interface Function<T,R>
        Type Parameters:
        T - the type of the input to the function
        R - the type of the result of the function
        */

        Function<String, Integer> func = x -> x.length();
        int len = func.apply("This is java 8");
        System.out.println(len);

        //Chaining function

        Function<Integer, Integer> func1 = x -> x*2;
        int len1 = func.andThen(func1).apply("This is sagar chawla");
        System.out.println(len1);
    }
}
