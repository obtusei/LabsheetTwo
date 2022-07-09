
// Create a program to read a text file and displays each record
import java.io.BufferedInputStream; // BufferedInputStream class is used to read the file
import java.io.FileInputStream; // FileInputStream is used with other input streams to read the data (in bytes) more efficiently.

public class Q21 {
          public static void main(String[] args) {
                    try {

                              // Creates a FileInputStream
                              FileInputStream file = new FileInputStream("file.txt");

                              // Creates a BufferedInputStream
                              BufferedInputStream input = new BufferedInputStream(file);

                              // Reads first byte from file
                              int i = input.read();

                              while (i != -1) {
                                        System.out.print((char) i);

                                        // Reads next byte from the file
                                        i = input.read();
                              }
                              input.close();
                    }

                    catch (Exception e) {
                              e.getStackTrace();
                    }
          }
}
