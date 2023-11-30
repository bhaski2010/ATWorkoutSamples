package com.set;


import java.util.HashSet;
import java.util.Set;

public class SetExAllMethods {
    public static void main(String []args) {
    Set<Integer> s1 = new HashSet<>();
    s1.add(10);
    s1.add(12);
    s1.add(11);
    s1.add(20);
    s1.add(30);
    s1.add(60);
    s1.add(50);
    s1.add(100);
    System.out.println("Given Set 1: "+ s1);
    int size;
    size = s1.size();
    System.out.println("\nThe Size of the given size: " + size);
    Boolean con = s1.contains(50);
    System.out.println("The value 50 is available in the given set: " + con);
    Boolean emp = s1.isEmpty();
    System.out.println("The given Set is Empty: " + emp);
    s1.remove(50);
    System.out.println("Set1 value removed after 50: " + s1);
    Set<Integer> s2 = new HashSet<>();
    s2.add(110);
    s2.add(120);
    s2.add(130);
    s2.add(140);
    s2.add(150);
    s2.add(10);
    s2.addAll(s1);
    System.out.println("Set 2 value after adding Set1 : " + s2);
    s1.retainAll(s2);
    System.out.println("S1 with Common value of S1 & S2: " + s1);
    s1.removeAll(s2);
    System.out.println("S1 after removing common values between S1 & S2: " + s1);
    }
}
