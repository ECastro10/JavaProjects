/**
 * Created by emanuel on 3/16/17.
 */
import java.util.Scanner;

public class InchesToCentimeters {
    public static void main( String[] args) {
//        Create our two variables
        int Inches;
        final double CentimetersPerInch = 2.54;
        double Centimeters;
//        Write code to allow input.
        Scanner in = new Scanner(System.in);
        System.out.println("Convert Inches to Centimeters");
        System.out.println("How many inches? ");
        Inches = in.nextInt();
        Centimeters = Inches * CentimetersPerInch;
        System.out.printf("\n%d inches = %.2f centimeters", Inches, Centimeters);
    }
}
