package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx2 {
    public static void main(String[]args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(90);
        System.out.println("Given List is: " + l1);
        int findex = l1.indexOf(10);
        System.out.println("First Index position of 10 in the List is: " + findex);

        List<Integer> l2 = new LinkedList<>();
        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(90);
        l2.add(10);
        l2.add(10);
        l2.add(40);
        l2.add(50);
        System.out.println("\nGiven List is: "+l2);
        int lindex = l2.lastIndexOf(10);
        System.out.println("Last Index position of 10 in the List is: " + lindex + "\n");
        int v1 = l2.get(2);
        System.out.println("Printing the value from Index position 2: "+ v1 + "\n");

        int v2 = l2.get(4);
        System.out.println("Printing the value from Index position 4: "+ v2);
    }
}
