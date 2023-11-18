package arrays;

public class SumOfArrays {
    public static void main(String[]a) {
        int nums[] = new int[5];
        nums[0] = 2;
        nums[1] = 4;
        nums[2] = 6;
        nums[3] = 8;
        nums[4] = 10;

        System.out.println("Printing the Array");

        for ( int i : nums) {
            System.out.println(i);
        }
        int sum = 0;
        for (int j=0; j<nums.length; j++) {
            sum += nums[j];
        }
        System.out.println("Sum of all array values :" + sum);
    }
}
