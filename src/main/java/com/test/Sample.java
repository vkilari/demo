package com.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {

    public static void main(String args[]) {


        int[] numbers = {1,5, 7,9, 10};
        String[] names = {"James", "Peter", "Austin", "Daniele"};
        String[] names2 = {"Andrew", "Saket", "Ketie", "Steve"};

       List<String> empNames = Arrays.asList(names);
        List<String> empNames2 = Arrays.asList(names2);

       //empNames.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);

        List<String> empList =Stream.of(empNames, empNames2).flatMap(Collection::stream).sorted().collect(Collectors.toList());
        empList.forEach(System.out::println);
       // empNames.parallelStream().forEach(names1 -> System.out.println(names1+ ""+ Thread.currentThread().getName()));

    }
}
