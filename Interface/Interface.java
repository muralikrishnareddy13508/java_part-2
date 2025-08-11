public class Interface {
    public static void main(String[] args){

        // interface = A blueprint for a class that specifies a set of abstract methods
        //             that implementing classes MUST define
        //             Supports multiple inheritance-like behaviour
        //             Very similar to abstract classes

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

    }
}
