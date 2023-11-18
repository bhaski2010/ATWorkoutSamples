package cons;

public class ParentClassA {
    public ParentClassA() {
        System.out.println("non-para cons");
    }

    public ParentClassA(int id) {
        this();
        System.out.println("Student ID: " + id);
    }

    public ParentClassA(String name) {
        this(123);
        System.out.println("Student name: " + name);
    }

    public ParentClassA(float percentage) {
        this("Manic");
        System.out.println("Percentage scored: " + percentage);
    }
}
