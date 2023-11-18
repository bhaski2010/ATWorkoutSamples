package qsix;

import java.util.Scanner;

public class OddEven {
    public static void main(String[]a) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter your desired number: ");
        int n = s1.nextInt();
        if (n%2==0)
            System.out.println("The number entered is Even Number");
        else {
            System.out.println("The number entered is Odd Number");
        }
    }
}
