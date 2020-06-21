package main.java.FifthDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

    public static void main(String[] args) {
        List<Customer> customerList = Arrays.asList(
                new Customer("Tom",20),
                new Customer("Sagar",28),
                new Customer("Peter", 52),
                new Customer("John",27)
        );

        String name = customerList
                .stream()
                .filter(data -> "Peter".equals(data.getName()))
                .map(Customer::getName)
                .findAny()
                .orElse(null);
        System.out.println(name);

        // print all names from the list

        List<String> list =customerList
                .stream()
                .map(Customer::getName)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
