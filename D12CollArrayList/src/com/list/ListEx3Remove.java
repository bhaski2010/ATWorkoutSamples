package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3Remove {

    public static void main (String[]args) {
        List<String> l1 = new ArrayList<>();
        l1.add("10");
        l1.add("20");
        l1.add("AI");
        l1.add("40");
        l1.add("50");
        l1.add("Google");

        //removing the value from 10th index
        System.out.println("\nGiven List is: " + l1);
        System.out.println("\n Enter the Index number to remove the value from List: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        try {
            l1.remove(i);
        }
        catch (IndexOutOfBoundsException ie) {
            System.out.println("There is no "+i+"th position in the List " + ie );
        }
        System.out.println("Final List value after removing: " + l1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(10);
        l2.add(90);
        l2.add(10);
        l2.add(40);
        System.out.println("Given List is: "+l2);
        System.out.println("Enter index position to remove the value from List2");
        int j = sc.nextInt();
        try{
            l2.remove(j);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("There is no "+j+"th position in the List "+ e);
        }
        System.out.println("Final List value after removing: "+l2);

    }
}
