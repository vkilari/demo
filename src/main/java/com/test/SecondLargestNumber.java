package com.test;

public class SecondLargestNumber {
    public static void main(String args[]){
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(secondLargest(array));

    }

    private static int secondLargest(int[] array) {

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }
}
