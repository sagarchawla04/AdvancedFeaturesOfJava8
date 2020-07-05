package main.java.SixthDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetWithFlatMap {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setName("Sagar");
        employee1.addDevices("iPhone8");
        employee1.addDevices("samsungS9");
        employee1.addDevices("samsungS10");
        employee1.addDevices("OppoF9");

        Employee employee2 = new Employee();
        employee2.setName("Tom");
        employee2.addDevices("MacBook");
        employee2.addDevices("samsungS9");
        employee2.addDevices("LenovoK9");
        employee2.addDevices("OppoF11");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);

        List<String> devicesList = employeeList.stream()
                                        .map(x -> x.getDevices()) //Stream<Set<String>>
                                        .flatMap(x -> x.stream()) //Stream<String>
                                        .distinct()
                                        .collect(Collectors.toList());

        devicesList.forEach(System.out::println);//print all list of devices
    }
}
