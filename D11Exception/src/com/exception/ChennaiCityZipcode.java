package com.exception;

import java.util.Scanner;

public class ChennaiCityZipcode {
    String zipcode = "";
    public static void main(String[] args) {
        System.out.println("Enter the Pincode: ");
        Scanner sc = new Scanner(System.in);
        String zipcode = sc.next();
        if(zipcode.startsWith("6")) {
            System.out.println("The entered pincode is valid for Chennai City");
        }
        else {
            try {
                throw new CityNotFoundException();
                }
            catch (CityNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

}
