package com.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx4commonvalue {
    public static void main(String[]args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(90);
        s1.add(10);
        s1.add(10);
        s1.add(50);
        s1.add(40);

        Set<Integer> s2 = new HashSet<>();
        s2.add(30);
        s2.add(40);
        s2.add(50);
        s2.add(60);
        s2.add(80);

    System.out.println("Given Set 1 : " + s1);
    System.out.println("Given Set 2 : " + s2);
    s1.retainAll(s2);
    System.out.println("\nReturning the common value from Set 1 & Set2: " + s1);
    }
}
