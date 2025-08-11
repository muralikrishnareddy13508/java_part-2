public class Super {
    public static void main(String[] args){

        // super = refers to the parent class (subclass <- superclass
        //         used constructors and method overriding
        //         Calls the parent constructor to initialize attributes


        Person person = new Person("james", "bond");
        Student student = new Student("Harry", "potter", 4.2);
        Employee employee = new Employee("Jeremy", "Fitzgerald", 120.60);

        person.showName();
        System.out.println();
        student.showName();
        student.ShowGPA();
        System.out.println();
        employee.showName();
        employee.showSalary();
    }
}
