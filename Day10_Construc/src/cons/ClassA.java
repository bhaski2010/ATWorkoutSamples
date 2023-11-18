package cons;

public class ClassA {
    public ClassA(){
        System.out.println("non-para cons");
    }
    public ClassA(int id){
        this();
        System.out.println("Student ID: " + id);
    }

    public ClassA(String name){
        this(123);
        System.out.println("Student name: " + name);
    }

    public ClassA(float percentage){
        this("Manic");
        System.out.println("Percentage scored: " + percentage);
    }

    public static void main(String[]args){
        System.out.println("Calling all constructor with one object");
        ClassA c1 = new ClassA(73.98f);
    }
}
