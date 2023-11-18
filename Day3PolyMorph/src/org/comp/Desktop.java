package org.comp;

public class Desktop extends Computer{
    public void desktopSize(){
        System.out.println("Desktop size is 14 inch");
    }

    public static void main(String[]a) {
        Desktop d = new Desktop();
        d.computerModel();
        d.desktopSize();
    }

}
