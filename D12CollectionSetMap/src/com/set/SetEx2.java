package com.set;

import java.util.*;

public class SetEx2 {
    public static void main(String[]args){
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(90);
        l1.add(10);
        l1.add(10);
        l1.add(40);
        l1.add(50);
        System.out.println("Given List is: " + l1);
        System.out.println("****Converting List into Set Using Add All****");

        Set<Integer> s1 = new HashSet<>();
        s1.addAll(l1);
        System.out.println("\nHashSet converted from List 1: "+s1);
        Set<Integer> s2 = new LinkedHashSet<>();
        s2.addAll(l1);
        System.out.println("LinkedHashSet converted from List 1: "+s2);
        Set<Integer> s3 = new TreeSet<>();
        s3.addAll(l1);
        System.out.println("TreeSet converted from List 1: "+s3);
    }
}
