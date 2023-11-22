package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx5AddatEnd {
    public static void main(String[]args){
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(10);
        l1.add(50);
        l1.add(10);
        l1.add(60);
        System.out.println("Given List is: "+l1);
        //Add a value 100 at the last index of 10 in the list
        int lastindex0f10;

        lastindex0f10 = l1.lastIndexOf(10);
        System.out.println("Last Index of value 10 is: "+lastindex0f10);
        l1.add(lastindex0f10, 100);
        System.out.println("Final Modified List: "+l1);
    }
}
