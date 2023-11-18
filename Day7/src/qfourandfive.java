import java.util.Scanner;

public class qfourandfive {
    public static void main(String[]a){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Value 1 for comparing: ");
        String s1 = sc1.nextLine();
        System.out.println("Enter Value 2 for comparing: ");
        String s2 = sc1.nextLine();
        System.out.println("Enter your email ID: ");
        String s3 = sc1.nextLine();

        System.out.println("**** Comparing two Strings");
        boolean eq1 = s1.equals(s2);
        if(eq1)
        System.out.println("Both of the Strings are Equal");
        else {
        System.out.println("Both of the Strings are NOT Equal");
            }

        System.out.println("\n**** Comparing two Strings - Case insensitive");
        boolean eq2 = s1.equalsIgnoreCase(s2);
        if(eq2==true)
            System.out.println("Both of the Strings are Equal");
        else {
            System.out.println("Both of the Strings are NOT Equal");
        }
            System.out.println("\n**** Checking for @ using contains");

            boolean cont1 = s3.contains("@");
            if (cont1 == true)
                System.out.println("This is valid email address");
            else {
                System.out.println("The email entered is NOT valid as there is NO @ symbol available");
            }
    }
}
