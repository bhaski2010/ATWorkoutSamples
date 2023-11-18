package org.edu;

public class Arts extends Education{
    public void ug(){
        System.out.println("We have several UG courses in Arts");
    }
    public void pg(){
        System.out.println("We have several PG courses in Arts");
    }
    public void bse(){
        System.out.println("BSE - Bachelor of Science");
    }
    public void eEd(){
        System.out.println("BED - Bachelor of Education");
    }
    public void ba(){
        System.out.println("BA - Bachelor of Arts");
    }
    public static void main(String[]a) {
        Arts ar = new Arts();
        ar.pg();
        ar.ug();
        ar.bse();
        ar.eEd();
        ar.ba();
    }
}
