// Create a program using try and catch statements

public class Q14 {
          public static void main(String[] args) {
                    System.out.println("Name: Abhishek Bhatta and CRN:019-312");
                    try { // try block
                              int a = Integer.parseInt(args[0]); // passing the first argument as integer
                              System.out.println("First Argument: " + a);
                    } catch (NumberFormatException e) { // catching the exception if the argument is not an integer
                              System.out.println("Invalid input");
                    }
          }
}
