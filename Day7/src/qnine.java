import java.util.Scanner;

public class qnine {
    public static void main(String[]a) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter String 1 value: ");
        String s1 = sc1.nextLine();

        System.out.println("Enter String 2 value: ");
        String s2 = sc1.nextLine();

        System.out.println("String 1 value entered: " + s1 + "\nString 2 value entered: " + s2);
        int compare1 = s1.compareTo(s2);
        int compare2 = s2.compareTo(s1);
        if (compare1==compare2)
        System.out.println("Both String are same");
        else {
            System.out.println("Both Strings are different");
            }
    }

}
