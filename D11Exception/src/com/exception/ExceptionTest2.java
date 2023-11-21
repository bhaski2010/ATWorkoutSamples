package com.exception;

public class ExceptionTest2 {
    public static void main(String[] args) {
        int MyArray[] = new int[5];
        //adding a number to index 5 which is not there in the given array

            MyArray[0] =0;
            MyArray[1] = 1;
            MyArray[2] = 2;
            MyArray[3] = 3;
            MyArray[4] = 4;
        try {
            MyArray[5] = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println("Dividing any number by 0 is not possible");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("We can't declare value outside of available index values");
        }
        catch (Exception e){
            System.out.println("This is to handle any other exception which is not handled above");
        }
        System.out.println("**** The values entered into Array ****");
          for (int Arr:MyArray) {
                System.out.println(Arr);
        }

    }
}
