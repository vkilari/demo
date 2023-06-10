package com.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

          /*
          list1 = "John", "Rahul", "David"

          list2  = "Kiran", "Sam", "James"

          List3 = "Walter", "Suman", "Suresh", "Jonathan"

          List4 = "Johney", "Sean","Jude"

         * */
          private static List < List<String> > productsList = new ArrayList < List<String> > ();

    public static void main(String args[]) {


//        productsList.add(new Product(1, "HP Laptop", 25000f));
//        productsList.add(new Product(2, "Dell Laptop", 30000f));
//        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
//        productsList.add(new Product(4, "Sony Laptop", 28000f));
//        productsList.add(new Product(5, "Apple Laptop", 90000f));

       List<String> list1 = Arrays.asList("John", "Rahul", "David");
        List<String> list2 = Arrays.asList("Kiran", "Sam", "James");
        List<String> list3 = Arrays.asList("Walter", "Suman", "Suresh", "Jonathan");
        List<String> list4 = Arrays.asList("Johney", "Sean","Jude");


        productsList.add(list1);
        productsList.add(list2);
        productsList.add(list3);
        productsList.add(list4);


       // withStreamAPI();


        /*List<String> newList = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        newList.forEach(System.out::println);*/

        List<String> newList =  Stream.of(list1, list2, list3, list4).flatMap(Collection::stream).filter(x -> x.startsWith("J")).collect(Collectors.toList());
        newList.forEach(System.out::println);



    }

    /*private static void withStreamAPI() {
        // filtering data of list
        List < Float > productPriceList = productsList.stream().filter(product -> product.getPrice() > 25000)
                .map((product) -> product.getPrice()).collect(Collectors.toList());
        // displaying data
        productPriceList.forEach((price) -> System.out.println(price));
    }*/

    private static void withStreamAPI() {
        // filtering data of list
        List < String > productPriceList = productsList.stream().filter(x -> x.toString().startsWith("j"))
                .map((x) -> x.toString()).collect(Collectors.toList());
        // displaying data
        productPriceList.forEach((price) -> System.out.println(price));
    }


}

/*
You are given an array of positive numbers from 1 to n, such that all numbers from 1 to n are present except one number ‘x’.
        You have to find ‘x’. The input array is not sorted.

        n=10


*/






