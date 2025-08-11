public class Student extends Person{

    double gpa;

    Student(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }

    void ShowGPA(){
        System.out.println(first + "'s gpa is: " + gpa);
    }
}
