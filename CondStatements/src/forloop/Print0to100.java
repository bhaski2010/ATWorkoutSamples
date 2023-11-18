package forloop;

import java.util.Scanner;

public class Print0to100 {
    public void vote() {
        Scanner s1 = new Scanner(System.in);
        int age = s1.nextInt();
        System.out.println(age);
//     if (age <= 18) {
  //   System.out.println("Eligible to Vote");
    //}
     //else {
//         System.out.println("Not Eligible to Vote");
     //}
    }


    public static void main (String[]a) {
        Print0to100 pr = new Print0to100();
        pr.vote();
    }
}
