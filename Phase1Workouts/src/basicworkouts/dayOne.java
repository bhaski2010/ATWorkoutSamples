package basicworkouts;

import com.sun.jdi.connect.Connector;

public class dayOne {
//method names
    public void empName() {
        System.out.println("Bhaski");
    }
    public void empAddress() {
        System.out.println("G14, SSLV, Balagere");
    }

    public void empID() {
        System.out.println("1234");
    }

    public static void main (String[]args) {
        dayOne d1 = new dayOne();
        d1.empID();
        d1.empName();
        d1.empAddress();
    }
}
