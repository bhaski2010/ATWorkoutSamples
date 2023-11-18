package org.stud;

import java.util.Scanner;

public class StudentInfo {
    Scanner s1 = new Scanner(System.in);
    public void studID(){
        System.out.println("Enter the Student ID: ");
        int studID = s1.nextInt();
        System.out.println("Student ID: " + studID);
    }
    public void studName() {
        System.out.println("Enter the Student Name: ");
        String studName = s1.nextLine();
        System.out.println("Student Name is: " + studName);
    }

    public void mark1() {
        System.out.println("Enter the Marks for Tamil: ");
        int m1 = s1.nextInt();
        System.out.println("Marks scored in Tamil: " + m1);
    }

    public void mark2() {
        System.out.println("Enter the Marks for English: ");
        int m2 = s1.nextInt();
        System.out.println("Marks scored in English: " + m2);
    }

    public void mark3() {
        System.out.println("Enter the Marks for EVS: ");
        int m3 = s1.nextInt();
        System.out.println("Marks scored in EVS: " + m3);
    }

    public void mark4() {
        System.out.println("Enter the Marks for Maths: ");
        int m4 = s1.nextInt();
        System.out.println("Marks scored in Maths: " + m4);
    }

    public void mark5() {
        System.out.println("Enter the marks for Science: ");
        int m5 = s1.nextInt();
        System.out.println("Marks scored for Science: " + m5);
    }

    public static void main(String[]args) {
        StudentInfo si = new StudentInfo();
        si.studID();
        si.studName();
        si.mark1();
        si.mark2();
        si.mark3();
        si.mark4();
        si.mark5();

    }
}
