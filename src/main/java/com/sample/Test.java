package com.sample;

import java.util.Arrays;
import java.util.List;

public class Test {

    static  List numbers = Arrays.asList(30, 32, 15, 17, 0, 12, 2, 16, 14, 12, 18);

    public static void main(String args[]) {

        int lenght = numbers.size();

        try {
            if (lenght > 0) {

                for (int i =0; i<lenght-1; i++){
                    int j=(Integer) numbers.get(i);
                    System.out.println("" + j);
                    int k = j+(Integer) numbers.get(i+1);
                   // if (k==32)
                        System.out.println(">>>>>Values>>>>" + k);

                }

                //

            }
        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
