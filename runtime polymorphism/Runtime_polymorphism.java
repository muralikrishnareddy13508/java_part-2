import java.util.Scanner;

public class Runtime_polymorphism {
    public static void main(String[] args){

        //Runtime Polymorphism (dynamic polymorphism) = when the method gets executed is decided at
        //                                              runtime based on the actual types of the object

        Scanner scanner = new Scanner(System.in);


        Animal animal;

        System.out.print("would you like a dog or a cat (1 = dog and 2 = cat): ");
        int choice = scanner.nextInt();

        if (choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2){
            animal = new Cat();
            animal.speak();
        }
    }
}
