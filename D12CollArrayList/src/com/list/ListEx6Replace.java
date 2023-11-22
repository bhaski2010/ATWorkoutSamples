package com.list;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ListEx6Replace {
    public static void main(String[]args){
        List<Integer> l1 = new Vector<>();
        l1.add(100);
        l1.add(200);
        l1.add(300);
        l1.add(400);
        l1.add(500);
        l1.add(600);
        l1.add(700);
        System.out.println("\nGiven list is: " + l1);
        System.out.println("Enter the Index position to replace: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("Enter the value to replace: ");
        int value = sc.nextInt();
        try{
            l1.set(index, value);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("*******The mentioned position is not available in the given List******* "+e);
        }
        System.out.println("\nModified List is: "+ l1);
    }
}
