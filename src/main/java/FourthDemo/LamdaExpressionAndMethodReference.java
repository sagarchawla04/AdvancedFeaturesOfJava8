package main.java.FourthDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaExpressionAndMethodReference {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom","Peter","Sagar","Simon");

        //1. With Anonymous class
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
            System.out.println(s);
            }
        });

        //2. With Lambda expression
        names.forEach(str -> System.out.println(str));

        //3. Method references
        names.forEach(System.out :: println);

    }
}
