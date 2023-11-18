package org.emp;

import java.util.Scanner;

public class EmployeeInfo {

    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);

    public void empID() {
        System.out.println("Enter the Emp ID: ");
        int empID = s1.nextInt();
        System.out.println("Emp ID is: " + empID);
    }
    public void empName() {
        System.out.println("Enter the Emp Name : ");
        String empName = s2.nextLine();
        System.out.println("Emp Name is: " + empName);
    }
    public void empEmail() {
        System.out.println("Enter the Emp Email : ");
        String empEmail = s1.next();
        System.out.println("Emp Email is: " + empEmail);
    }
    public void empPhoneno() {
        System.out.println("Enter the Emp Phone Number");
        long empPhoneno = s1.nextLong();
        System.out.println("Emp Phone No is:" + empPhoneno);
    }
    public void empSalary() {
        System.out.println("Enter the Emp Salary");
        float empSalary = s1.nextFloat();
        System.out.println("Emp Salary is: " + empSalary);
    }
    public void empGender() {
        System.out.println("Enter Emp Gender: ");
        char empGender = s1.next().charAt(0);
        System.out.print("Emp Gender is: " + empGender);
    }

    public void empCity() {
        System.out.println("Enter Emp City");
        String emCity = s1.next();
        System.out.println("Emp City is: " + emCity);
    }

    public static void main (String[]args) {
        EmployeeInfo e1 = new EmployeeInfo();
        e1.empID();
        e1.empName();
        e1.empEmail();
        e1.empGender();
        e1.empPhoneno();
        e1.empSalary();
        e1.empCity();
    }

}