package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx8RemoveAll {
    public static void main(String []args){
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

        System.out.println("\nList 1: " +l1);
        System.out.println("List 2: " +l2);
        l1.removeAll(l2);
        System.out.println("\nModified List is: " + l1);
    }
}
