public class Car {

    String make = "ford";
    String name = "mustang";
    String color = "red";
    double price = 59999.99;
    int year = 2025;
    boolean isAvailable = false;
    boolean isRunning = false;

    void start(){
        System.out.println("you start the engine.");
        isRunning = true;
    }
    void stop(){
        System.out.println("you stop the engine.");
        isRunning = false;
    }
}
