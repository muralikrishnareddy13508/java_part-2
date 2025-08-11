public class Fish implements Predator, Prey{

    @Override
    public void hunt() {
        System.out.println("*the fish is hunting*");
    }

    @Override
    public void flee() {
        System.out.println("*the fish is swimming away*");
    }
}
