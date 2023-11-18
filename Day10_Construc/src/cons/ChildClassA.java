package cons;

public class ChildClassA extends ParentClassA{
    public ChildClassA(){
        super(78.79f);
        System.out.println("non-para cons from Child Class");
    }

    public ChildClassA(String address){
        this();
        System.out.println("Student Address : " + address);
    }

    public static void main(String []args) {
        ChildClassA cl = new ChildClassA("Balagere, Bengaluru");
    }

}
