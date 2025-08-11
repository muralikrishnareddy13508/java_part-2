public class Inheritance {
    public static void main(String[] args){

        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               child <- parent
        //               ex: public class something extends something{}

        // Multi-level Inheritance = child <- parent <- grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        //dog.eat();
        //cat.eat();
        plant.photosynthesize();

        //dog.speak();
        //cat.speak();

        //System.out.println(dog.lives);
        //System.out.println(cat.lives);

    }
}
