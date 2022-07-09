// Create a program using try and multiple catch statements 

public class Q15 {
          public static void main(String[] args) {
                    System.out.println("Name: Abhishek Bhatta and CRN:019-312");
                    try { // try block
                              int a = Integer.parseInt(args[0]); // passing the first argument as integer
                              int b = Integer.parseInt(args[1]); // passing the second argument as integer
                              int c = a / b;
                              System.out.println(c);
                    } catch (NumberFormatException e) { // catching the exception if the argument is not an integer
                              System.out.println("Invalid input");
                    } catch (ArithmeticException e) { // catching the exception if the second argument is zero
                              System.out.println("Division by zero");
                    } catch (ArrayIndexOutOfBoundsException e) { // catching the exception if the number of arguments is
                                                                 // not equal to 2
                              System.out.println("Invalid input");
                    }
          }
}
