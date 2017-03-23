/**
 * Created by emanuel on 3/21/17.
 * This class allows the user to convert one of these options into all the remaining options: Centimeters, Inches, and
 * Feet.
 */
import java.util.Scanner;

public class converterCmInFt {

    public static void main(String[] args) {

//        Create variables to be used
        double Centimeters;
        double Inches;
        double Feet;
        int MeasurementType = 0;
        double MeasurementAmount = 0;
        final double CM_TO_IN = 2.54;
        final double FT_TO_IN = 12;
        int firstOption = 0;
        int secondOption = 0;


//        Get user input for measurement type and amount, and desired output
        Scanner in = new Scanner(System.in);

        while (MeasurementType <= 0 || MeasurementType >= 4) {
            System.out.println("What is your starting measurement?");
            System.out.println("1) Centimeters\n2) Inches\n3) Feet");
            MeasurementType = in.nextInt();

            while (MeasurementAmount <= 0) {
                System.out.println("What amount are you trying to convert?\nNumbers only, up to two decimal places.");
                MeasurementAmount = in.nextDouble();

                switch (MeasurementType) {
                    case 1:
                        Centimeters = MeasurementAmount;
                        Inches = Centimeters / CM_TO_IN;
                        Feet = Inches / FT_TO_IN;

                        System.out.printf(MeasurementAmount + " cm =\n%.2f in\n%.2f Ft", Inches, Feet);
                        break;

                    case 2:
                        Inches = MeasurementAmount;
                        Centimeters = Inches * CM_TO_IN;
                        Feet = Inches / FT_TO_IN;

                        System.out.printf(MeasurementAmount + " in =\n%.2f cm\n%.2f Ft", Centimeters, Feet);
                        break;

                    case 3:
                        Feet = MeasurementAmount;
                        Inches = Feet * FT_TO_IN;
                        Centimeters = Inches * CM_TO_IN;

                        System.out.printf(MeasurementAmount + " ft =\n%.2f in\n%.2f cm", Inches, Centimeters);
                        break;
                }

            }
        }
    }
}