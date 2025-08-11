public class Polymorphism {
    public static void main(String[] args){

        //Polymorphism = "POLY" = "MANY"
        //               "MORPH" = "SHAPE"
        //               Objects can identify as other objects.
        //               Objects can be treated as objects of a common superclass
        //               it can be achieved using interfaces too
        

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat}; //the car, bike and boat are identifying as vehicles
                                                //  because they extend to vehicle class

        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
