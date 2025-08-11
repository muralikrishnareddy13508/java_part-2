import java.util.Scanner;

public class Enumerations {
    public static void main(String[] args){

        //Enums = (Enumerations) A special kind of class that represent a fixed set of constants
        //        They improve code readability and are easy to maintain.
        //        More efficient with switches rather than comparing Strings.

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter a day of a week: ");
        String response = scanner.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(response);

            switch (day){
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->
                        System.out.println("IT IS A WEEK DAY");

                case SATURDAY, SUNDAY ->
                        System.out.println("IT IS WEEKEND");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("please enter a valid day!");
        }

        scanner.close();
    }
}
