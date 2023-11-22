package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        //adding values to the list
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(90);
        l1.add(10);
        l1.add(10);
        l1.add(40);
        l1.add(50);
        System.out.println("Given Array List: " + l1);
        System.out.println("The length of the Array List is: " + l1.size());
        System.out.println("Printing the list items one by one using for loop");
        for (int i= 0; i<l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        System.out.println("Printing the list using enhanced forloop");
        for (int al:l1) {
        System.out.println(al);
        }

        List<Integer> l2 = new LinkedList<Integer>();
        l2.add(100);
        l2.add(200);
        l2.add(300);
        l2.add(400);
        l2.add(500);
        l2.add(600);
        l2.add(700);
        System.out.println("\nGiven Linked List: " + l2);
        System.out.println("The length of the Linked List is: " + l2.size());
        System.out.println("Printing the lists using enhanced forloop");
        for (int ll : l2) {
        System.out.println(ll);
        }

        List<Integer> l3 = new Vector<>();
        l3.add(105);
        l3.add(205);
        l3.add(305);
        l3.add(405);
        l3.add(505);
        l3.add(605);
        l3.add(705);
        l3.add(805);
        System.out.println("\nGiven Vector List: " + l3);
        System.out.println("The length of the Vector List is: " + l3.size());
        System.out.println("Printing the lists using enhanced forloop");
        for (int vl : l3) {
        System.out.println(vl);
        }
    }
}
