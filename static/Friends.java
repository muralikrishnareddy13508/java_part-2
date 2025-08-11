public class Friends {

    // int noOfFriends; // all objects from Friends will have their own copy of noOfFriends
    static int noOfFriends; // all objects will share one.
    String name;

    Friends(String name){
        this.name = name;
        noOfFriends++;
    }
    static void showFriends(){
        System.out.println("You have " + noOfFriends + " friends");
    }                         //             └────────> this does not need to be written in
                              //            'this.noOfFriends' because it is a static method or whatever
}
