public class Anonymous_classes {
    public static void main(String[] args){

        //Anonymous class = A class that doesn't have a name. cannot be reused.
        //                  Add custom behavior without having to create new class.
        //                  Often used for one line uses (TimerTask, Runnable, callbacks)
        //                  Instead of creating a whole new class for one different object we can create an anonymous class

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
          @Override
          void speak(){
              System.out.println("Scooby doo goes **proceeds to speak english**");
          }
        };

        dog1.speak();
        dog2.speak();
    }
}
