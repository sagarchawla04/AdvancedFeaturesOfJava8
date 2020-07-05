package main.java.EighthDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {
    public static void main(String[] args) {

        ForkJoinPool corePools = ForkJoinPool.commonPool();
        System.out.println(corePools.getParallelism()); //3

        //1. Using parallel() method on stream
        Stream stream = Stream.of("Sagar","Tom","Peter","kamal","Virat");
        Stream.of("Sagar","Tom","Peter","kamal","Virat").forEach(System.out::println); // Sequential stream
        System.out.println("----");
        Stream.of("Sagar","Tom","Peter","kamal","Virat").parallel().forEach(System.out::println);// Parallel stream
        System.out.println("----");

        //2. Use parallel stream method on collection stream
        Arrays.asList("Sagar","Tom","Peter","kamal","Virat").parallelStream().forEach(System.out::println);
        System.out.println("----");

        // Print 1 to 10
        IntStream.range(1,10).forEach(System.out::println); // Sequential Stream
        System.out.println("----");
        IntStream.range(1,10).parallel().forEach(System.out::println); // Parallel Stream
        System.out.println("----");

        // Print from a - z-> 97 - 122
        getAlphabetsList().stream().forEach(System.out::println); // Sequential stream
        System.out.println("----");
        getAlphabetsList().parallelStream().forEach(System.out::println); //Parallel Stream


        //Check stream is running in parallel: isParallel
        IntStream range1 = IntStream.range(1,10);
        System.out.println(range1.isParallel()); //false

        IntStream range2 = IntStream.range(1,10).parallel();
        System.out.println(range2.isParallel()); //true


    }

    public static List<String> getAlphabetsList(){
        List<String> alpha= new ArrayList<>();
        int n = 97;

        while (n<=122){
            char c = (char) n;
            alpha.add(String.valueOf(c));
            n++;
        }
        return alpha;
    }
}
