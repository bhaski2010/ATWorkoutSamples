package studentmarklist;

public class StudentRank extends StudentMarks{
    public static void main(String[]a){
        StudentRank sr1 = new StudentRank();
        sr1.setStdRollNo(1);
        sr1.setStdName("Ravi");
        sr1.setChemMarks(98);
        sr1.setPhyMarks(70);
        sr1.setMathMarks(100);

        System.out.println("Student Name: " + sr1.getStdName());
        System.out.println("Strudent Roll Number: " + sr1.getStdRollNo());
        System.out.println("Marks secured in Maths: " + sr1.getMathMarks());
        System.out.println("Marks secured in Physics: " +sr1.getPhyMarks());
        System.out.println("Marks secured in Chemistry:" + sr1.getChemMarks());
        System.out.println("Total Marks: " + sr1.marksTotal()+"\n"+ "\n");

        StudentRank sr2 = new StudentRank();
        sr2.setStdRollNo(2);
        sr2.setStdName("Prem");
        sr2.setChemMarks(89);
        sr2.setPhyMarks(79);
        sr2.setMathMarks(90);
        System.out.println("Student Name: " + sr2.getStdName());
        System.out.println("Strudent Roll Number: " + sr2.getStdRollNo());
        System.out.println("Marks secured in Maths: " + sr2.getMathMarks());
        System.out.println("Marks secured in Physics: " +sr2.getPhyMarks());
        System.out.println("Marks secured in Chemistry:" + sr2.getChemMarks());
        System.out.println("Total Marks: " + sr2.marksTotal()+"\n"+ "\n");

        StudentRank sr3 = new StudentRank();
        sr3.setStdRollNo(3);
        sr3.setStdName("Mark");
        sr3.setChemMarks(97);
        sr3.setPhyMarks(70);
        sr3.setMathMarks(90);
        System.out.println("Student Name: " + sr3.getStdName());
        System.out.println("Strudent Roll Number: " + sr3.getStdRollNo());
        System.out.println("Marks secured in Maths: " + sr3.getMathMarks());
        System.out.println("Marks secured in Physics: " +sr3.getPhyMarks());
        System.out.println("Marks secured in Chemistry:" + sr3.getChemMarks());
        System.out.println("Total Marks: " + sr3.marksTotal()  +"\n"+ "\n");

        StudentRank sr4 = new StudentRank();
        sr4.setStdRollNo(4);
        sr4.setStdName("Antony");
        sr4.setChemMarks(99);
        sr4.setPhyMarks(97);
        sr4.setMathMarks(99);
        System.out.println("Student Name: " + sr4.getStdName());
        System.out.println("Strudent Roll Number: " + sr4.getStdRollNo());
        System.out.println("Marks secured in Maths: " + sr4.getMathMarks());
        System.out.println("Marks secured in Physics: " +sr4.getPhyMarks());
        System.out.println("Marks secured in Chemistry:" + sr4.getChemMarks());
        System.out.println("Total Marks: "   + sr4.marksTotal()+ "\n"+ "\n");
    }
}
