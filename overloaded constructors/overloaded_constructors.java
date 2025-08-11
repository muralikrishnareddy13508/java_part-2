public class overloaded_constructors {
    public static void main(String[] args){

        //overloaded constructors = Allow a class to have multiple constructors
        //                          with different parameter lists,
        //                          enable objects to be initialized in various ways

        User user0 = new User();
        User user1 = new User("Edwin Murry");
        User user2 = new User("Henry Emily", "HEmily87@faz.com");
        User user3 = new User("William Afton", "WA1983@faz.com", 90);

        System.out.println(user0.username);
        System.out.println(user0.email);
        System.out.println(user0.age);

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

    }
}
