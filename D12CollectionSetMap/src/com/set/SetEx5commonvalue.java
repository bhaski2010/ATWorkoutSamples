package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx5commonvalue {
    public static void main(String[] args) {
        Set<String> s1 = new LinkedHashSet<>();
        s1.add("Manik");
        s1.add("Antony");
        s1.add("Mark");
        s1.add("Navin");
        s1.add("Raju");
        s1.add("Balu");

        Set<String> s2 = new LinkedHashSet<>();
        s2.add("Manick");
        s2.add("Antony");
        s2.add("Mark");
        s2.add("NaVIN");
        s2.add("Raja");
        s2.add("Balu");
        System.out.println("Given Set 1: "+s1);
        System.out.println("Given Set 2: "+s2);
        s1.retainAll(s2);
        System.out.println("\nPrinting the common values from S1 & S2"+ s1);
    }
}
