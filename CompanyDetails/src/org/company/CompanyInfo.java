package org.company;

import org.employee.EmployeeDetails;

public class CompanyInfo {

    public void companyName() {
        System.out.println("Company Name: WDC");
    }
    public void companyID() {
        System.out.println("Company ID: 201");
    }

    public void companyAddress() {
        System.out.println("Company Address: Marathahalli, Bengaluru");
    }

    public static void main(String[]args) {
        CompanyInfo ci = new CompanyInfo();
        ci.companyName();
        ci.companyID();
        ci.companyAddress();

        EmployeeDetails e2 = new EmployeeDetails();
        e2.empName();
        e2.empName();
        e2.empAddress();
    }
}
