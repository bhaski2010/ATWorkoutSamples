package numbertest;

public class EncapsTest1 extends Number {
    public static void main(String[]a){
        EncapsTest1 enct1 = new EncapsTest1();
        enct1.setY("Bhaski");
        System.out.println("Modified name 1 : " + enct1.getY());

        EncapsTest1 enct2 = new EncapsTest1();
        enct2.setY("Cinthi");
        String Name2 = enct2.getY();
        System.out.println("Modified Name 2: " + Name2);

        EncapsTest1 enct3 = new EncapsTest1();
        enct3.setY("Sushu");
        String Name3 = enct3.getY();
        System.out.println("Modified Name 3: " + Name3);

        EncapsTest1 enct4 = new EncapsTest1();
        enct4.setY("Mahima");
        String Name4 = enct4.getY();
        System.out.println("Modified Name 4: " + Name4);
        System.out.println("Repeating Name 4 in alternate way of calling : " + enct4.getY());
    }


}
