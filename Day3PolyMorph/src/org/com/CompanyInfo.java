package org.com;

public class CompanyInfo {
    public void companyDetail(int regno) {
        System.out.println("The company Reg # is: " + regno);
    }
    public void companyDetail(int empcount, int brcount) {
        System.out.println("Total number of employee: " + empcount);
        System.out.println("Total number of branches: " + brcount);
    }
    public void companyDetail(String comname, String comloc, String comtyepe){
        System.out.println("Company name: " + comname);
        System.out.println("Company location: " + comloc);
        System.out.println("Company type: " + comtyepe);
    }

    public static void main(String[]a) {
        CompanyInfo ci = new CompanyInfo();
        ci.companyDetail(8769);
        ci.companyDetail(768, 3);
        ci.companyDetail("Mannar & Co", "Moon", "Customer support");
    }
}
