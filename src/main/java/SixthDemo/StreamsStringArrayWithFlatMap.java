package main.java.SixthDemo;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsStringArrayWithFlatMap {

    public static void main(String[] args) {
        /*
        String data[][]=new String[][]{{"a","b"},{"c","d"},{"e","f"}};
        Stream<String> dataStream = Arrays.stream(data);
        Stream<String> dataStreamFilter = dataStream.filter(x -> "a".equals(x.toString()));

        dataStreamFilter.forEach(System.out::println); // no print will happen here

        */

        String data[][]=new String[][]{{"a","b"},{"c","d"},{"e","f"}};
        Stream<String[]> dataStream = Arrays.stream(data);
        // Apply flatmap
        Stream<String> streamFlatMap = dataStream.flatMap(x -> Arrays.stream(x));
        Stream<String> dataStreamFilter = streamFlatMap.filter(x -> "a".equals(x.toString()));

        dataStreamFilter.forEach(System.out::println); // a


        // Another way - composite actions
        Stream<String> finalStream = Arrays.stream(data).flatMap(x -> Arrays.stream(x)).filter(x -> "b".equals(x.toString()));
        finalStream.forEach(System.out::println); //b
    }
}
