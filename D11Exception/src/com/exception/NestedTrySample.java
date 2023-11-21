package com.exception;

public class NestedTrySample {
    public static void main(String[] args) {

        try {
            //main try block

            try {
                // try block 1
                System.out.println("Try block 1");
                int num = 15 / 0;
                System.out.println("Entered value is: " + num);
            } catch (ArithmeticException e1) {
                System.out.println("Block 1 Exception: " + e1);
            }
            try {
                //try block 2
                System.out.println("\nTry block 2");
                int [] ar = new int [2];
                ar[0] = 10;
                ar[1] = 20;
                ar[2] = 30;
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Block 2 Exception: " + e2);
            }
            System.out.println("\nGeneral statement after Block1 and Block2");
        }
        catch (ArithmeticException e3) {
            System.out.println("\nMain Block Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e4) {
            System.out.println("Main Block ArrayIndexOutOfBoundsException");
        }
        catch (Exception e5) {
            System.out.println("Main Block General Exception");
        }
        System.out.println("Code after Nested Try Block");
    }
}