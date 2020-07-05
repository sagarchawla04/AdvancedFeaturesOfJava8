package main.java.SeventhDemo;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreams {
    public static void main(String[] args) {

        //Eg: 1
        Stream stream = Stream.of("Sagar","Tom","Peter","Kamal");
        stream.forEach(System.out::println); // stream is closed now
       // stream.findFirst().ifPresent(System.out::println); // will give illegal state exception

        //Eg: 2
        Arrays.asList("a1","a2","a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        //Eg: 3 - print range 1 to 5
        IntStream.range(1,5).forEach(System.out::println);

        //Eg: 4 -
        Arrays.stream(new int[]{1,2,3,4})
                .map(n -> 2*n+1)
                .average()
                .ifPresent(System.out::println); // 6.0

        //Eg: 5 - String data objects
        Stream.of("a1","a2","a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println); //3

        //Eg: 6 - Doubles to string objects
        Stream.of(1.0,2.0,3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a"+i)
                .forEach(System.out::println);// a1,a2,a3

        //Eg: 7 - Limit
        Stream.iterate(0,n-> n+1)
                .limit(10)
                .forEach(System.out::println);

        //Eg: 8 - 10 odd numbers
        Stream.iterate(0,n-> n+1)
                .filter(x -> x%2 !=0)
                .limit(10)
                .forEach(System.out::println);

    }
}
