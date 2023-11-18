package qone;

public class litStrings {
    public static void main(String []a){
        System.out.println("****Literal String******");
        String s1 ="Nisha";
        String s2 = "Nisha";
        System.out.println("String1 value: "+ s1 + "  and the memory address of it: "+ System.identityHashCode(s1));
        System.out.println("String2 value: "+ s2 + "  and the memory address of it: "+ System.identityHashCode(s2));
        System.out.println("Incase of duplicate, the existing string will be used in  Literal Strings\n");
        s1 = s1.replaceAll("Nisha", "Bashaa");
        System.out.println("Original S1 value after modifying: " + s1);
        System.out.println(("Memory of Org value: " + System.identityHashCode(s1)));
        System.out.println("Org String is Immutable");


        System.out.println("\n****Non-Literal String******");
        String s3 = new String("Nisha");
        String s4 = new String("Nisha");
        System.out.println("String value: "+ s3 + "  and the memory address of it: " + System.identityHashCode(s3));
        System.out.println("String value: "+ s4 + "  and the memory address of it: "+ System.identityHashCode(s4));
        System.out.println("Incase of duplicate, the new string will be created in  Non-Literal Strings\n");

        System.out.println("All operations of Non literaal Strings (Mutable)");
        StringBuffer buffer = new StringBuffer("John");
        System.out.println("Original before modifying: " + buffer);
        StringBuffer rev = buffer.reverse();
        System.out.println("Original String buffer value after modifying: " + buffer + " and Reversed value: " + rev);
        System.out.println("Memory of Org Value: " + System.identityHashCode(buffer));
        System.out.println(("Memory of Revised value: " + System.identityHashCode(rev)));
        System.out.println("Org String is Mutable using String buffer or String Builder");

        StringBuffer buffer2 = new StringBuffer("Mark");
        System.out.println("Original before modifying: " + buffer2);
        StringBuffer app = buffer2.append(" Antony");
        System.out.println("Original String buffer value post append: " + buffer2 + "\nModified value: " + app);

        StringBuilder build1 = new StringBuilder("Sushaanth");
        System.out.println("Original before modifying: " + build1 + "\t "+ System.identityHashCode(build1));
        StringBuilder del = build1.deleteCharAt(4);
        System.out.println("Original String buffer value post deleting: " + build1 + "\nModified value: " + del + "\t"+System.identityHashCode(del));
    }
}
