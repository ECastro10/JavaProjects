/**
 * Created by emanuel on 3/16/17.
 */
import java.util.Scanner;

public class InputAndOutput {
    public static void main( String[] args) {
//        Create string variable to save the user input to.
        String line;
//      Create Scanner in variable that takes in the input.
        Scanner in = new Scanner(System.in);
//      Tell the user to type something.
        System.out.print("Type something: ");
//      Our previously declared variable is now equal to the input. nextLine() is part of Scanner
        line = in.nextLine();
//      Print what the user typed in.
        System.out.println("You said: " + line);
//      Repeat
        System.out.print("Type something else: ");
        line = in.nextLine();
        System.out.println("You also said: " + line);
    }
}
