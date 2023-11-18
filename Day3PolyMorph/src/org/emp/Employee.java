package org.emp;

public class Employee {
    public void empId(int id){
        System.out.println("Print the Employee ID: " + id);
    }

    public void empId(int id, String name){
        System.out.println("Print emp ID: " + id);
        System.out.println("Print emp name: " + name);
    }

    public void empId(String name, int id){
        System.out.println("Print emp ID: " + id);
        System.out.println("Print emp name: " + name);
    }

    public static void main (String[]a){
        Employee e = new Employee();
        e.empId(123);
        e.empId(456, "Mahi");
        e.empId("Sush", 789);
    }
}
