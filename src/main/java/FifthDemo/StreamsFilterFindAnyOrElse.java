package main.java.FifthDemo;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyOrElse {

    public static void main(String[] args) {

        // list of customers objects
        List<Customer> customerList = Arrays.asList(
                new Customer("Tom",20),
                new Customer("Sagar",28),
                new Customer("Peter", 52),
                new Customer("John",27)
        );

        // 1. Filter- findAny
        Customer customer= customerList
                .stream()
                .filter(data -> "Peter".equals(data.getName()))
                .findAny() // if it finds then returns
                .orElse(null);// if above line doesn't find any then this line will be executed
        System.out.println(customer.getName() +" -> "+customer.getAge()); // 52

        // 2. Filter- did not find any -> OrElse
        Customer customer1= customerList
                .stream()
                .filter(data -> "Peter1".equals(data.getName()))
                .findAny() // if it finds then returns
                .orElse(null);// if above line doesn't find any then this line will be executed
        System.out.println(customer1.getName() +" -> "+customer1.getAge()); // null pointer exception

        // 3. Filter with multiple conditions
        Customer customer2 =customerList
                .stream()
                .filter(data -> "John".equals(data.getName()) && 27 == data.getAge())
                .findAny()
                .orElse(null);
        System.out.println(customer2.getName() +" -> "+customer2.getAge());


    }
}
