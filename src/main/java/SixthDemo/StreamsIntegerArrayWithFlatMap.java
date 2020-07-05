package main.java.SixthDemo;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsIntegerArrayWithFlatMap {

    //Why flatmap is used
    // we can't apply filter directly on below things:
    //Stream<String[]> ls.filter();
    //Stream<List<String>> ls.filter();
    //Stream<Set<String>> ls.filter();
    //Stream<List<String>> ls.filter();

    public static void main(String[] args) {

        int data[] = {1,2,3,4,5,6,7,8,9};

        Stream<int[]> streamArray = Stream.of(data);
        IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));
        intStream.forEach(x -> System.out.println(x));

    }
}
