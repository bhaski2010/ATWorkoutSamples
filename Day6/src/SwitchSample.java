import java.util.Scanner;

public class SwitchSample {
    public static void main(String[]a){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the day number reference: ");
        int day = s.nextInt();
        switch (day) {
            case 1:
                System.out.println("Entered Day is Monday");
                break;
            case 2:
                System.out.println("Entered day is Tuesday");
                break;
            case 3:
                System.out.println("Entered day is Wednesday");
                break;
            case 4:
                System.out.println("Entered day is Thursday");
                break;
            case 5:
                System.out.println("Entered day is Friday");
                break;
            case 6:
                System.out.println("Entered day is Saturday");
                break;
            case 7:
                System.out.println("Entered day is Sunday");
                break;
            default:
                System.out.println("The number entered is out of days");
                break;
        }


    }
}
