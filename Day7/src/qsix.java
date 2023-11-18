import java.util.Optional;
import java.util.Scanner;

public class qsix {
    public static void main(String[] a) {
        String s1 = "Welcome to Java";
        String s2 = "Welcome to sql";
        String replacev1 = s1.replace("Java", "sql");
        System.out.println("Printing the String 1: " + s1);
        System.out.println("Replaced value: " + replacev1);

        String replacev2 = s1.replaceAll("Welcome to Java", "Welcome to SQL2");
        System.out.println("Replaced value 2: " + replacev2);

        String replacev3 = s1.replace(" ", "#");
        System.out.println("Replaced value 3: " + replacev3);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the Email ID: ");
        String emailid1 = sc1.nextLine();
        System.out.println("The Email ID Entered is: " + emailid1);
        String modemail1 = null;
        if(emailid1.contains("gmail"))
            modemail1 = emailid1.replace("gmail", "yahoo");
            System.out.println(" Modified email ID1: " + modemail1);
            System.out.println("Original emailID1 : " + emailid1);

        }
    }
