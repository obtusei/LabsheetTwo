
// Create a program to writing data to a sequential text file with class Formatter
import java.util.Formatter;
import java.util.Scanner;

public class Q20 {

          public static void main(String[] args) {
                    System.out.println("Name: Abhishek Bhatta and CRN:019-312");
                    Formatter output;
                    int index = 1;
                    try {
                              output = new Formatter("clients.txt");
                              Scanner sc = new Scanner(System.in);
                              while (index <= 5) {
                                        System.out.print(index + "). Enter client's name: ");
                                        String data = sc.nextLine();
                                        output.format("%d. %s\n", index, data);
                                        index += 1;
                              }
                              output.close();
                              sc.close();
                    } catch (Exception e) {
                              System.err.println("Error");
                    }

          }

}
