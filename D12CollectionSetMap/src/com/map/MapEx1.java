package com.map;

import java.util.*;

public class MapEx1 {
    public static void main(String[] args) {
        Map<Integer, String > m1 = new HashMap<>();
        m1.put(10, "java");
        m1.put(20, "sql");
        m1.put(30, "oops");
        m1.put(40, "Sql");
        m1.put(50, "oracle");
        m1.put(60, "selenium");
        m1.put(70, "Hadoop");
        m1.put(70,"RepeatedKey"); // Key is can't be dupilcated, when we add a duplicate key the value is updated in the same key
        m1.put(null, "Test1");
        m1.put(null, "Test2");
        m1.put(80, null);
        m1.put(90,null);
        m1.put(100, null);
        System.out.println("\nGiven Map 1 - HashMap: " + m1);
        System.out.println("HashMap accepts 1 null and value accepts n null - Prints in Random order");
        Set<Integer> keysets1 = m1.keySet();
        System.out.println("Printing only keys from Map: " + keysets1);
        Collection<String> values1 = m1.values();
        System.out.println("Printing only values from Map: " + values1);
        System.out.println("*************Iterating the map*************");
        Set<Map.Entry<Integer, String>> entryset = m1.entrySet();
        System.out.println(entryset);
        for (Map.Entry <Integer, String> newentry:entryset) {
        System.out.println(newentry);
        }

        Map<Integer, String > m2 = new LinkedHashMap<>();
        m2.put(1, "10");
        m2.put(3, "");
        m2.put(2, null);
        m2.put(4, "DB");
        m2.put(5, "map");
        m2.put(6, null);
        m2.put(null, "test1");
        m2.put(null,null);
        m2.put(7, "test2");
        System.out.println("\nGiven Map 2 - LinkedHashMap: " + m2);
        System.out.println("LinkedHashMap accepts 1 null and value accepts n null - Prints in insertion order");
        Set<Integer> keysets2 = m2.keySet();
        System.out.println("Printing only key from Map: " + keysets2);
        Collection<String> values2 = m2.values();
        System.out.println("Printing only values from Map: " + values2);
        System.out.println("*************Iterating the map*************");
        Set<Map.Entry<Integer, String>> entryset2 = m2.entrySet();
        System.out.println(entryset2);
        for (Map.Entry<Integer, String> newentry2:entryset2) {
        System.out.println(newentry2);
        }

        Map<String, String> m3 = new TreeMap<>();
        m3.put("!", "10");
        m3.put("@", "20");
        m3.put("#", "30");
        m3.put("$", "40");
        m3.put("%", "50");
        m3.put("^", "60");
        m3.put("&", "10");
        m3.put("*", "50");
        m3.put("(", "40");
        System.out.println("\nGiven Map 3 - TreeMap: " + m3);
        System.out.println("TreeMap ignores 1 null in key and accepts n null in value - Prints in Ascending order");
        Set<String> keyset3 = m3.keySet();
        System.out.println("Printing only key from Map: " + keyset3);
        Collection<String> values3 = m3.values();
        System.out.println("Printing only values from Map: " + values3);
        System.out.println("*************Iterating the map*************");
        Set<Map.Entry<String,String>> entrySet3 = m3.entrySet();
        System.out.println(entrySet3);
        for (Map.Entry<String,String> newentry3 : entrySet3) {
        System.out.println(newentry3);
        }

    }
}
