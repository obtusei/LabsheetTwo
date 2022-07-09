
class MyException extends Exception {
          public MyException(String errorMessage) {
                    super(errorMessage);
          }
}

public class Q17 {

          static void validate(int age) throws MyException {
                    if (age < 18) {

                              // throw an object of user defined exception
                              throw new MyException("age is not valid to vote");
                    } else {
                              System.out.println("welcome to vote");
                    }
          }

          public static void main(String[] args) {
                    System.out.println("Name: Abhishek Bhatta and CRN:019-312");
                    try {
                              int age = Integer.parseInt(args[0]);
                              validate(age);
                    } catch (MyException e) {
                              System.out.println(e.getMessage());
                    } catch (ArrayIndexOutOfBoundsException e) {
                              System.out.println("Invalid input");
                    } catch (NumberFormatException e) {
                              System.out.println("Invalid input");
                    }

          }
}
