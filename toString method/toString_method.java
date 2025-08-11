public class tostring_method {
    public static void main(String[] args){

        //.toString = Method Inherited from the Object class.
        //            used to return a string representation of an object.
        //            By default, it returns a hashcode as a unique identifier.
        //            it can be overridden to provide meaningful details.

        Car car1 = new Car("ford", "mustang", 2025, "Black");
        Car car2 = new Car("Maruti Suzuki", "Celerio", 2015, "blue");

        System.out.println(car1);
        System.out.println(car2);
    }
}
