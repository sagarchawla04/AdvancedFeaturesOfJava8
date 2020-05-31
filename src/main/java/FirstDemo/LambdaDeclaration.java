package main.java.FirstDemo;

public class LambdaDeclaration {

    public static void main(String[] args) {

        WebPage w1 = new WebPage() { // We don't need to create a separate class to implement the interface

            @Override
            public void header(String value) {
                System.out.println("Hi " + value);
            }
        };

        WebPage w2 = new WebPage() { // We don't need to create a separate class to implement the interface

            @Override
            public void header(String value) {
                System.out.println("Hello " + value);
            }
        };
        w1.header("Google");
        w2.header("Facebook");
    }
}
