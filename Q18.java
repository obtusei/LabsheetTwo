
// Create a program to read and write to a file. 
import java.io.FileInputStream; // importing file input stream class
import java.io.FileOutputStream; // importing file output stream class
import java.util.Scanner;
import java.io.FileNotFoundException; // importing file not found exception class

public class Q18 {

          public static void main(String[] args) {
                    System.out.println("Name:Abhishek Bhatta and CRN: 019-312");
                    Scanner scn = new Scanner(System.in); // creating a new scanner object
                    String data; // declaring a string variable
                    System.out.println("Enter the data to be written to the file:"); // prompting the user to enter the
                                                                                     // data
                    data = scn.nextLine(); // passing the input to the string variable
                    String stringPath = "input.txt"; // creating a string path
                    write(stringPath, data); // calling the write method
                    read(stringPath); // calling the read method
                    scn.close();
          }

          public static void write(String stringPath, String data) {
                    try {
                              // FileOutputStream class is use to write data to a file
                              FileOutputStream output = new FileOutputStream(stringPath);

                              // convertinng data to bytes
                              byte[] array = data.getBytes();

                              // Writes byte to the file
                              output.write(array);

                              output.close();
                    }

                    catch (Exception e) {
                              e.getStackTrace();
                    }
          }

          public static void read(String stringPath) {
                    try {

                              // FileInputStream class is used to read data from a file
                              FileInputStream input = new FileInputStream(stringPath);
                              System.out.println("Data in the file: ");

                              // Reads the first byte
                              int i = input.read();
                              while (i != -1) {
                                        System.out.print((char) i);

                                        // Reads next byte from the file
                                        i = input.read();
                              }
                              input.close();

                    } catch (FileNotFoundException e) { // catching file not found exception
                              System.out.println("File doesn't exist.");
                    } catch (Exception e) { // catching exception
                              System.out.println("Error in reading the file.");
                    }
          }
}
