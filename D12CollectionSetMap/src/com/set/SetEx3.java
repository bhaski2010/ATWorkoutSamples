package com.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
    public static void main(String[]args){
        Set<String> s1 = new HashSet<>();
        s1.add("Kiran");
        s1.add("Ravi");
        s1.add("Joshua");
        s1.add("Koushik");
        s1.add("Raja");
        System.out.println("\nPrinting the Set value one by one");
        for (String set1 : s1){
            System.out.println(set1);
        }
    }
}
