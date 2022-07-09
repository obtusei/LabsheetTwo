// Create a program using File class to obtain file and directory information.

import java.io.File;

public class Q19 {

          public static void main(String[] args) {
                    String fname = args[0];
                    File f = new File(fname);
                    System.out.println("Name: Abhishek Bhatta and CRN:019-312");
                    System.out.println("File name: " + f.getName());
                    System.out.println("Absolute path: " + f.getAbsolutePath());
          }
}
