package main.java.NinthDemo;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {
    public static void main(String[] args) {
        // infinite streams - used to generate infinite stream of data

        //1. Iterate method
            //static method(T seed,unaryOperator<T> f)
            // return a stream --> Stream<T>
        List<Integer> collectList = IntStream.iterate(0, n -> n+2)
                .mapToObj(Integer::valueOf)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(collectList);

        //2. Generate method
            //static method generate(Supplier<T> s)
            // Generate random number upto 100

        List<Integer> collectList1 = Stream.generate(() -> (new Random()).nextInt(100))
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(collectList1);

    }
}
