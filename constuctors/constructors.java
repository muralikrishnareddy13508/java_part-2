import java.util.Scanner;

public class constructors {
    public static void main(String[] args){

        //constructor = A special method to initialize objects
        //              you can pass arguments to a constructor
        //              and set up initial values

        Student student1 = new Student("spongebob", 30, 2.8);
        Student student2 = new Student("patrick", 35, 1.1);
        Student student3 = new Student("sandy", 25, 4.9);

        /*
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        */

        student1.study();
        student2.study();
        student3.study();
    }
}
