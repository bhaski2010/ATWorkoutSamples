package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx6Remove {
    public static void main(String[]args){
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(90);
        s1.add(10);
        s1.add(10);
        s1.add(40);
        s1.add(50);

        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(30);
        s2.add(40);
        s2.add(50);
        s2.add(60);
        s2.add(80);
        System.out.println("Given Set 1: "+s1);
        System.out.println("Given Set 2: "+s2);
        s1.removeAll(s2);
        System.out.println("Printing Set 1 after removing the common value: " + s1);

        Set<Integer> s3 = new TreeSet<>();
        s3.add(100);
        s3.add(200);
        s3.add(300);
        s3.add(30);
        s3.add(400);
        s3.add(500);
        s3.add(8000);
        System.out.println("\nGiven Set 2: "+s2);
        System.out.println("Given Set 3: "+s3);
        s2.removeAll(s3);
        System.out.println("Printing the S2 after removing common values between s2 & S3: " + s2);

    }
}
