package com;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Sample {

    public static void main(String args[]) {


        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        RomanConversion romanConversion = new RomanConversion(numbers);

        String[] input = {"V", "LXXIII", "LXXIII"};
        //[V, LXXIII, LXXIII]
        //output [5, 73, 124]

        for (int i =0 ; i<input.length; i++) {

            int length = input[i].length();
            System.out.println(">>>>>>>>>>>>>>"+length);
            if (length >= 1) {
                System.out.println(">>>>>>>>>>>>>>"+input[i]);
               char[] romanChar = input[i].toCharArray();
//               for (j =0; i< romanChar.length; j++) {
//
//               }
                //romanConversion.getNumbers().values().stream().filter(x -> x.equals(input[i]);
               // Stream.of(romanConversion).filter(z -> z.getNumbers().values().equals(input[i])).forEach(x -> x.getNumbers().values().forEach(System.out::println));

            }

        }








    }
}
