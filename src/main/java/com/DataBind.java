package com;

import java.util.*;
import java.util.stream.Collectors;

public class DataBind {

    public static void main(String args[]) {
        //empList<Emp> -- 20K recordsEmp -
        // Id, Name, Designation and  Salary
        // Get all the emp id between 10-15K && Get all emp with Name 'V'
        // Sort the list based on Name, followed by Id

        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee(10001, "Peter", "Architect", 10000);
        Employee employee2 = new Employee(10020, "Daniele", "Analyst", 2);
        Employee employee3 = new Employee(15001, "James", "Engineer", 10000);
        Employee employee4 = new Employee(15001, "Venkat", "Senior Architect", 10000);

        employeeList.add(employee);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        employeeList.stream().filter(x -> (x.getId() > 10000 && x.getId() <15000) || x.getName().startsWith("V")).collect(Collectors.toList()).forEach(name ->{System.out.println(name.getName());});


        //Streams with map
        /*Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "Larry");
        namesMap.put(2, "Steve");
        namesMap.put(3, "James");
        namesMap.put(4, null);

        namesMap.forEach((key, value) -> {
            if (value != null) {
                System.out.println(key+"===="+value);
            }
        });*/

        //Parallel Streams

        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
//        listOfNumbers.stream().forEach(number ->
//                System.out.println(number + " " + Thread.currentThread().getName())
//        );

        employeeList.parallelStream().forEach(number ->
                System.out.println(number.getName() + " " + Thread.currentThread().getName()));
    }
}
