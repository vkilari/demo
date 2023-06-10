package com.test;

public class FactorialInteger {
    public static void main(String args[]){
        System.out.println(factorial(9));

    }

    public static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
