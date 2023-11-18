package qeight;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[]a) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = s1.nextInt();
        if(num%2==0)
            System.out.println("Even Number");
        else {
            System.out.println("Odd Number");
        }
    }
}
