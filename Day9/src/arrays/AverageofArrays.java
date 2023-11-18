package arrays;

import java.util.Arrays;

public class AverageofArrays {
    public void avgofArr() {
        int ar1[] = new int[6];

        ar1[0] = 8;
        ar1[1] = 2;
        ar1[2] = 6;
        ar1[3] = 4;
        ar1[4] = 6;
        ar1[5] = 10;

        System.out.println("The Array value provided here is : " + Arrays.toString(ar1));
        System.out.println("Print the Array value one by one\n");
        for ( int i: ar1) {
            System.out.println(i);
        }
        double sum =0;
        for (int j =0; j<ar1.length; j++) {
        sum = sum + ar1[j];
        }
        double avg = sum/ar1.length;

        System.out.println("Average value of the Array elements: " + avg);
    }

    public static void main(String[]a) {
        AverageofArrays avg = new AverageofArrays();
        avg.avgofArr();
    }
}
