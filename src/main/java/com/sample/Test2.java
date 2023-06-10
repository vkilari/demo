package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String args) {



        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee(1, "Venkat", 10000);
        Employee employee2 = new Employee(1, "Venkat3", 3000);
        Employee employee3 = new Employee(1, "Venkat4", 2000);
        Employee employee4 = new Employee(1, "Venkat5", 10000);
        employeeList.add(employee);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee2);


        employeeList.stream().filter(x -> x.getSalary()>5000).forEach(System.out::println);

    }
}
