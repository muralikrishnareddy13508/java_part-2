public class Static {
    public static void main(String[] args){

        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          commonly used for utility methods or shared resources

        Friends friend1 = new Friends("Spongebob");
        Friends friend2 = new Friends("Patrick");
        Friends friend3 = new Friends("Squidward");

        /*
        System.out.println(friend1.noOfFriends);
        System.out.println(friend2.noOfFriends);
        */ //instead of doing it for an object we can do it to the class itself -
                // - because it is a static method
        Friends.showFriends();
    }
}
