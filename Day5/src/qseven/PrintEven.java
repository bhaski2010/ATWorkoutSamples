package qseven;

public class PrintEven {
    public static void main(String[] a) {
        int number;
        for (number = 0; number <= 100; number++)
            if (number % 2 == 0) {
                System.out.println(number);
            }
    }

}

