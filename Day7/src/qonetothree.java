public class qonetothree {

    public static void main(String []a){
        String s1 = "How to find partcular character in string";
        String s2 = "SeleniumAutomationtool";
        String s3 = "velmurugan";
        String s4 = "j a v a p r o g r a m";
        String s5 = "9005784478";

        System.out.println("\n**************** Finding Length of String **********************");
        System.out.println("Length of String 1: " + s1.length());
        System.out.println("Length of String 2: " + s2.length());
        System.out.println("Length of String 3: " + s3.length());
        System.out.println("Length of String 4: " + s4.length());
        System.out.println("Length of String 5: " + s5.length());

        System.out.println("\n**************** Finding Index value of Characters **********************");
        int i1 = s1.lastIndexOf("o");
        System.out.println("Last Index of 'o' in String 1 is: " + i1);
        int i2 = s2.indexOf("o");
        System.out.println("Index of 'o' in String 2 is: " + i2);
        int i3 = s3.indexOf("n");
        System.out.println("Index of 'n' in String 3 is: " + i3);
        int i4 = s4.indexOf(" ");
        System.out.println("Index of empty space in String 4 is: " + i4);
        int i5 = s5.indexOf('8');
        System.out.println("Index of 8 in String 5 is: " + i5);

        System.out.println("\n**************** Finding particular character in String **********************");
        char v1 = s1.charAt(s1.indexOf("h"));
        System.out.println("Print the Char 'h' from String 1 using CharAt method: \t" + v1);
        char v2 = s2.charAt(s2.indexOf("o"));
        System.out.println("Print the Char 'o' from String 2 using the CharAt Method: \t" + v2);
        char v3 = s3.charAt(s3.indexOf("u"));
        System.out.println("Print the Char 'u' from String 3 using the CharAt Method: \t" + v3);
        char v4 = s4.charAt(s1.indexOf("p"));
        System.out.println("Printg the Char 'p' from String 4 using the CharAt Method: \t" + v4);
        char v5 = s5.charAt(4);
        System.out.println("Print the Char '7' from String 5 using the CharAt Method: \t" + v5);
    }
}
