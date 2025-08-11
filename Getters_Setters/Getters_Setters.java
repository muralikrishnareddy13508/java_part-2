public class Getters_Setters {
    public static void main(String[] args){

        //They help protect object data and add rules for accessing or modifying them
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.
        // you can use the keyword 'final' if you don't want to set up any set methods
        // you can add additional logic too

        
        Car car = new Car("charger", "yellow", 10000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        car.setColor("black");
        car.setPrice(9999);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
