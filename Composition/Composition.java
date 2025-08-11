public class Composition {
    public static void main(String[] args){

        //Composition = Represents a "part-of" relationship between objects.
        //              For example, an Engine is "part-of" a car.
        //              Allows complex objects to be constructed from smaller objects.

        Car car = new Car("mustang", 2025, "V8");
        // if you delete the car object you will no longer have the access to the engine

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}
