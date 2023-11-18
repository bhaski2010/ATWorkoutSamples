package studentregistration;

public class StudentForm extends Student{
    public static void main(String[]a){
        StudentForm sf1 = new StudentForm();
        sf1.setStdId(001);
        sf1.setStdName("Bhaski");
        sf1.setStdRollNumber(6001);
        int stdi1 = sf1.getStdId();
        String stdn1 = sf1.getStdName();
        int stdr1 = sf1.getStdRollNumber();
        System.out.println("Student 1 Details : " + "\n" + stdi1  + "\n" + stdn1 + "\n" + stdr1);

        StudentForm sf2 = new StudentForm();
        sf2.setStdId(002);
        sf2.setStdName("Mike");
        sf2.setStdRollNumber(6002);
        int stdi2 = sf2.getStdId();
        String stdn2 = sf2.getStdName();
        int stdr2 = sf2.getStdRollNumber();
        System.out.println("Student 2 Details : " + "\n" + stdi2  + "\n" + stdn2 + "\n" + stdr2);

        StudentForm sf3 = new StudentForm();
        sf3.setStdId(003);
        sf3.setStdName("Mani");
        sf3.setStdRollNumber(6003);
        int stdi3 = sf3.getStdId();
        String stdn3 = sf3.getStdName();
        int stdr3 = sf3.getStdRollNumber();
        System.out.println("Student 2 Details : " + "\n" + stdi3  + "\n" + stdn3 + "\n" + stdr3);
    }

}
