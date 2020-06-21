package main.java.FifthDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

    public static void main(String[] args) {
        List<String> productList = Arrays.asList("MacBook","IPhone","Shoes","Battery Charger","Bat");
        productList.forEach(str -> System.out.println(str));

        List<String> result = productList
                .stream()
                .filter(ele -> !ele.equals("Shoes"))
                .collect(Collectors.toList());
        result.forEach(str -> System.out.println(str)); // exclude shoes
    }


}
