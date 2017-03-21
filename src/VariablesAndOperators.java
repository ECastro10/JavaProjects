/**
 * Created by emanuel on 3/16/17.
 */
public class VariablesAndOperators {
    public static void main( String[] args){
        String greeting = "Hello!";
        int minutes = 60;
        int hours = 24;
        int seconds = 60;
        double pi = 3.14;
    System.out.println("Success, don't forget to make main public");
    System.out.println(hours + " hours in a day");
    System.out.println(minutes + " in an hour");
    System.out.println(seconds + " in a minute");
    System.out.println(hours + " hours in a day, " + (minutes * hours) + " minutes in a day, and " + ((minutes * hours) * seconds) + " seconds in a day");
    System.out.println(hours / 3.5);
    System.out.println(pi);
    }
}