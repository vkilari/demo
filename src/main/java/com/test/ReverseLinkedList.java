package com.test;

import java.util.LinkedList;

public enum ReverseLinkedList {
    ;

    public static void main(String args[]){
       reverse();
    }

    private static void reverse() {

            LinkedList<Integer> ll = new LinkedList<>();

            ll.add(1);
            ll.add(2);
            ll.add(3);

            System.out.println(ll);

            LinkedList<Integer> ll1 = new LinkedList<>();

            ll.descendingIterator().forEachRemaining(ll1::add);

            System.out.println(ll1);

    }


}
