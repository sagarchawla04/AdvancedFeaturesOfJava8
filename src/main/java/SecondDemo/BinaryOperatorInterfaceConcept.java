package main.java.SecondDemo;

import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

    public static void main(String[] args) {

        /*
        Represents an operation upon two operands of the same type, producing a result of the same type as the operands.
        This is a specialization of BiFunction for the case where the operands and the result are all of the same type.
        It extends bi function which requires three parameters
        @FunctionalInterface
        public interface BinaryOperator<T>
                extends BiFunction<T,T,T>
         */

        BinaryOperator<Integer> func = (integer, integer2) -> integer+integer2;
        int t = func.apply(10,20);
        System.out.println(t);
    }
}
