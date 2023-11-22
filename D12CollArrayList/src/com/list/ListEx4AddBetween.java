package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx4AddBetween {
    public static void main(String[]args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(100);
        l1.add(200);
        l1.add(300);
        l1.add(400);
        l1.add(500);
        l1.add(600);
        l1.add(700);
        System.out.println("Given List is: "+l1);
        //adding value in a specific index position
        System.out.println("Enter the index position to insert into list: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("Enter the value to insert into list: ");
        int value = sc.nextInt();
        try{
            l1.add(index,value);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("\n******The mentioned Index position is not available in the List******");
        }
            System.out.println("\nThe list modified list is: "+ l1);
    }
}
