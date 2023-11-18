package qfive;

import java.util.Scanner;

public class Voting {

    public static void main(String[]args) {
        Scanner s1 = new Scanner(System.in);
       System.out.println("Please Enter Your Age: ");
        int age = s1.nextInt();
        if (age<18) {
            System.out.println("You are NOT Eligible to Vote");
        }
            else {
                System.out.println("You are Eligible to Vote");
            }
        }

    }
