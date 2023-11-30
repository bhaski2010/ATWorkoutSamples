package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx1 {
    public static void main(String[]args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        s1.add(60);
        s1.add(70);
        s1.add(90);
        s1.add(10);
        s1.add(20);
        System.out.println("\nGiven HashSet is: "+s1);
        System.out.println("Printing the Set values one by 1 : ");
        for (Integer set1:s1) {
        System.out.println(set1);
        }
        System.out.println("Hashset doesn't allow duplicates and it prints in random order");

        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(10);
        s2.add(30);
        s2.add(20);
        s2.add(40);
        s2.add(50);
        s2.add(60);
        s2.add(70);
        s2.add(90);
        s2.add(10);
        s2.add(20);
        System.out.println("\nGiven LinkedHashSet is: "+s2);
        System.out.println("Printing the Set values one by 1 : ");
        for (Integer set2:s2) {
            System.out.println(set2);
        }
        System.out.println("LinkedHashset doesn't allow duplicates and it prints in insertion order");

        Set<Integer> s3 = new TreeSet<>();
        s3.add(10);
        s3.add(30);
        s3.add(20);
        s3.add(40);
        s3.add(60);
        s3.add(50);
        s3.add(90);
        s3.add(70);
        s3.add(10);
        s3.add(20);
        System.out.println("\nGiven TreeSet is: "+s3);
        System.out.println("Printing the Set values one by 1 : ");
        for (Integer set3:s3) {
            System.out.println(set3);
        }
        System.out.println("Treeset doesn't allow duplicates and it prints in ascending order");
    }

}
