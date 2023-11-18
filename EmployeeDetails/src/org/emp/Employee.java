package org.emp;

public class Employee {

    public void empID() {
       System.out.println("EMP ID : 1234");
    }

    public void empName() {
        System.out.println("Emp Name : Bhaski");
    }

    public void empAddress() {
        System.out.println("EMp Address : G14, SSLV, Balagere");
    }

    public void empPhoneNum() {
        System.out.println("Emp Phone Number : 9898989898");
    }

    public static void main (String[]args) {
        Employee e1 = new Employee();
        e1.empName();
        e1.empID();
        e1.empAddress();
        e1.empPhoneNum();
    }
}
