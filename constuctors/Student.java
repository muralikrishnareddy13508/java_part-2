public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // this is a constructor:
    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
        //this.something refers to the object that we are currently working with.

    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}
