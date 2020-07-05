package main.java.EighthDemo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {
    public static void main(String[] args) {
        long t1,t2,t3,t4;

        System.out.println(isPrime(7));

        // Sequential Stream:
        t1 = System.currentTimeMillis();
        long count = Stream.iterate(0,n -> n+1)
                .limit(100000)
                .filter(PrimeNumberWithParallelStream::isPrime)
                .peek(System.out::println)
                .count();
        System.out.println("Total Prime numbers "+count);
        t2 = System.currentTimeMillis();
        System.out.println("Total time taken for sequential stream is "+(t2-t1)/1000); // 5 seconds

        //Parallel Stream
        t3 = System.currentTimeMillis();
        long count1 = Stream.iterate(0,n -> n+1)
                .limit(100000)
                .parallel()
                .filter(PrimeNumberWithParallelStream::isPrime)
                .peek(System.out::println)
                .count();
        t4 = System.currentTimeMillis();
        System.out.println("Total Prime numbers "+count1);
        System.out.println("Total time taken for parallel stream is "+(t4-t3)/1000); // 3 seconds
    }

    public static Boolean isPrime(int number){
        if(number<=1) return false;

        return !IntStream.rangeClosed(2,number/2).anyMatch(x -> number%x==0);
    }
}
