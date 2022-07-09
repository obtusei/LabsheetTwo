import java.io.*;
import java.io.Serializable;

// 22. Create a program to implement Serializable Interface
class Student implements Serializable { // implements Serializable interface
          int id;
          String name;

          public Student(int id, String name) {
                    this.id = id;
                    this.name = name;
          }
}

public class Q22 {
          public static void main(String args[]) {
                    try {
                              // Creating the object
                              Student s1 = new Student(312, "Abhishek Bhatta"); // creating the object
                              // Creating stream and writing the object
                              FileOutputStream fout = new FileOutputStream("f.txt");
                              ObjectOutputStream out = new ObjectOutputStream(fout);
                              out.writeObject(s1);
                              out.flush();
                              // closing the stream
                              out.close();
                              System.out.println("success");
                    } catch (Exception e) {
                              System.out.println(e);
                    }
          }
}