package com.test;

import java.util.List;

public class CheckOddNumbers {
    public static void main(String args[]){
        System.out.println(onlyOddNumbers(9));

    }

    public static boolean onlyOddNumbers(int number) {

            if (number % 2 == 0)
                return false;

        return true;
    }
}
