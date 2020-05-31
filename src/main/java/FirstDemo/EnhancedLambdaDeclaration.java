package main.java.FirstDemo;

public class EnhancedLambdaDeclaration {

    public static void main(String[] args) {

        // Lambda can be only applied on functional interfaces and functional interface is an interface which has only one abstract method present in an interface

        // Replaced with Lambda
        EnhancedWebPage w1 = (value,age) -> System.out.println("Hi " + value + " age--> "+age);

        // Replaced with Lambda
        WebPage w2 = value -> System.out.println(value.toUpperCase());
        WebPage w3 = value -> System.out.println(value.length());

        w1.header("Tom",20);
        w2.header("Facebook");
        w3.header("Twitter");
    }
}
