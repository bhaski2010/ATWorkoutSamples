import java.util.Scanner;

public class qseven {
    public static void main(String []a) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the value for String 1 in  LowerCase: ");
        String s1 = sc1.nextLine();
        System.out.println("\nEntered String 1 value");
        String ms1 = s1.toUpperCase();
        System.out.println("String 1 value in Upper case: " + ms1);
        String ms2 = ms1.toLowerCase();
        System.out.println("Modified String 1 value in lower case: " + ms2);
    }
}
