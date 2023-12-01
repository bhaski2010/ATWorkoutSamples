package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx2 {
    public static void main(String []arg) {
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(10, "java");
        m1.put(20, "sql");
        m1.put(30, "oops");
        m1.put(40, "Sql");
        m1.put(50, "oracle");
        m1.put(60, "selenium");
        m1.put(70, "Hadoop");
        m1.put(null, "Test1");
        m1.put(80, null);
        m1.put(90, null);
        m1.put(100, null);
        System.out.println("\nGiven Map is: " + m1);
        int size = m1.size();
        System.out.println("Size of the given Map: " + size);
        String value1 = m1.get(90);
        System.out.println("Print the value of the Key 90: " + value1);
        String remvalue = m1.remove(80);
        System.out.println("Map value after removing the value of key 80: " + m1);
        int size1 = m1.size();
        System.out.println("Size of the given Map after removing key 80: " + size1);
        Boolean empty = m1.isEmpty();
        System.out.println("The Given Map is Empty: " + empty);
        Boolean conkey = m1.containsKey(90);
        if(conkey){
        System.out.println("The key 90 is available in the given map");
        }
        else {
            System.out.println("The Key 90 is NOT available in the given map");
        }
        Boolean convalue = m1.containsValue("test1");
        if(convalue){
            System.out.println("The value test1 is available in the given map");
        }
        else {
            System.out.println("The Key test1 is NOT available in the given map");
        }

        System.out.println("\n**** Printing only the keyset from map ****");
        Set<Integer> keyset = m1.keySet();
         System.out.println(keyset);

        System.out.println("\n**** Printing only the values from map ****");
        Collection<String> valueset = m1.values();
        System.out.println(valueset);

        System.out.println("\n**** Iterating Map using EntrySet ****");
        Set<Map.Entry<Integer, String>> entry = m1.entrySet();
        System.out.println(entry);
        for (Map.Entry<Integer, String> newentry : entry) {
            System.out.println(newentry);
        }
        System.out.println("\nPrinting only the keys from EntrySet");
        for (Map.Entry<Integer,String> keys:entry) {
            Integer keys2 = keys.getKey();
            System.out.println(keys2);
        }
        System.out.println("\nPrinting only the values from EntrySet");
        for (Map.Entry<Integer,String> value:entry) {
            String values2 = value.getValue();
            System.out.println(values2);
        }
        m1.clear();
        System.out.println("Prining Map after clearing all values" + m1);
    }
}
