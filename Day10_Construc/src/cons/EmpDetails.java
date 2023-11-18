package cons;

public class EmpDetails {
    public EmpDetails(){
        System.out.println("***** Printing the Non-Parameterized constructor *****");
    }
    public EmpDetails(int id){
        System.out.println("***** Printing Parameterized constructor *****");
        System.out.println("Employee ID: " + id);
    }
    public EmpDetails(String name){
        System.out.println("Employee Name: " + name);
    }
    public EmpDetails(float sal){
        System.out.println("Employee salary: " + sal);
    }

    public static void main(String[]args) {
        System.out.println("***** Calling each constructor with separate objects");
        EmpDetails e1 = new EmpDetails();
        EmpDetails e2 = new EmpDetails(6007);
        EmpDetails e3 = new EmpDetails("Mark Antony");
        EmpDetails e4 = new EmpDetails(1234567.89f);
    }
}
