package condi;

import java.util.Scanner;

public class Voting {
    public void vote() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your Age Here to check if you are eligible to Vote or not: ");
        int age = s1.nextInt();
          if (age < 18) {
        System.out.println("Your Age is below 18, hence you are Not Eligible to Vote");
        }
      else
      {
          System.out.println("Your Age is 18 and above, hence you are Eligible to Vote");
     }
    }


    public static void main (String[]a) {
        Voting v = new Voting();
        v.vote();
    }
}
