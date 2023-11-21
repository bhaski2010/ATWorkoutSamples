package com.exception;

public class ExceptionTest1 {
    public static void main(String[] args) {
        int a = 40;
        int b = 4;
        int c = 4;

       try {
           int result = a / (b - c);
           System.out.println("The result is : " + result);
       }
       catch (ArithmeticException e) {
           System.out.println("You can't devide a number with zero");
       }

    }
}
