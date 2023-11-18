package studentmarklist;

public class StudentMarks {
    int StdRollNo;

    String StdName;
    int PhyMarks;
    int ChemMarks;
    int MathMarks;

    public int marksTotal(){
        int total = getPhyMarks()+getChemMarks()+getMathMarks();
        return total;

    }

    public int getStdRollNo() {
        return StdRollNo;
    }

    public void setStdRollNo(int stdRollNo) {
        StdRollNo = stdRollNo;
    }

    public String getStdName() {
        return StdName;
    }

    public void setStdName(String stdName) {
        StdName = stdName;
    }

    public int getPhyMarks() {
        return PhyMarks;
    }

    public void setPhyMarks(int phyMarks) {
        PhyMarks = phyMarks;
    }

    public int getChemMarks() {
        return ChemMarks;
    }

    public void setChemMarks(int chemMarks) {
        ChemMarks = chemMarks;
    }

    public int getMathMarks() {
        return MathMarks;
    }

    public void setMathMarks(int mathMarks) {
        MathMarks = mathMarks;
    }
}
