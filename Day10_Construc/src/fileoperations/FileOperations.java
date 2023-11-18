package fileoperations;

import java.io.File;
import java.io.IOException;

public class FileOperations {

    public static void main (String []args) throws IOException {
   /*     File file = new File("/Users/macos/Documents/BH-AT/FileOperations/Sample");
       file.mkdir();
      boolean chkfol = file.isDirectory();
       if(chkfol){
           System.out.println("Folder Sample is Available: " + chkfol);
       }
       else
        {
            System.out.println("Folder Sample is NOT available");
        }

       File file1 = new File("/Users/macos/Documents/BH-AT/FileOperations/Sample2/test2/");
       file1.mkdirs();
    */
        //Creating file
        String f1 = "newfile.txt";
        String f2 = "newfileone.txt";
        String f3 = "newfiletwo.txt";
        String f4 = "newfilethree.txt";
        String f5 = "newfilefour.xls";
        String f6 = "newfilefive.pdf";

/*   File crfile = new File("/Users/macos/Documents/BH-AT/FileOperations/Sample2/test2/" + f1);
        boolean chkfile1 = crfile.createNewFile();
        if(chkfile1) {
            System.out.println("The file " + f1 + " is available in the location: " + chkfile1);
        }
*/
        File crfile2 = new File("/Users/macos/Documents/BH-AT/FileOperations/Sample2/" + f2);
        crfile2.createNewFile();

        File crfile3 = new File("/Users/macos/Documents/BH-AT/FileOperations/Sample2/" + f3);
        crfile3.createNewFile();

        File crfile4 = new File("/Users/macos/Documents/BH-AT/FileOperations/Sample2/" + f4);
        crfile4.createNewFile();

        File crfile5 = new File("/Users/macos/Documents/BH-AT/FileOperations/Sample2/" + f5);
        crfile5.createNewFile();

        File crfile6 = new File("/Users/macos/Documents/BH-AT/FileOperations/Sample2/" + f6);
        crfile6.createNewFile();

        // to list the files available in loc with path
        File path = new File("/Users/macos/Documents/BH-AT/FileOperations/Sample2/");
        File[] listfiles = path.listFiles();
        System.out.println("\nPrinting the files with path info");
        for ( File lp : listfiles) {
        System.out.println(lp);
        }

        // to list the files available in loc without path
        File path2 = new File("/Users/macos/Documents/BH-AT/FileOperations/Sample2/");
        String[] listfiles2 = path2.list();
        System.out.println("\nPrinting the files without path info");
        for (String lf:listfiles2) {
        System.out.println(lf);
        }

    }
}
