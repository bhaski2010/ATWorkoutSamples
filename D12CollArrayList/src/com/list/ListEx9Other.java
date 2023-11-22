package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx9Other {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        l1.add("Mark");
        l1.add("Antony");
        l1.add("Jailer");
        l1.add("Kiran");
        l1.add("101");
        l1.add("202");
        l1.add("Nellai");

        List<String> l2 = new ArrayList<>();
        l2.add("Bhasha");
        l2.add("Antony");
        l2.add("mark");
        l2.add("Jailer Muthuvel Pandian");
        l2.add("Dark Devil");
        l2.add("202");
        l2.add("Sankai");
        l2.add("neLLai");
        System.out.println("\nList 1: " + l1);
        System.out.println("List 2: " + l2);
        boolean contains = l1.contains("Jailer");
        boolean empty = l2.isEmpty();
        System.out.println("\nThe List 1 contains the value - Jailer : "+contains);
        System.out.println("The List 2 is Empty: " + empty);

        //adding one list into another
        l1.addAll(l2);
        System.out.println("Updated List 1 after adding list 2 into List 1:\n"+l1 );
        //clearing the list
        l2.clear();
        System.out.println("Modified List 2: "+l2);
        boolean empty2 = l2.isEmpty();
        System.out.println("List 2 Empty now: " + empty2);
    }
}