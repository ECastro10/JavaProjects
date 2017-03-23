/**
 * Created by emanuel on 3/16/17.
 */
//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        System.out.print("Welcome to the world of Java");
//    }
//}


//
//                  The code above is the old HelloWorld. "Learning Java" exercises below.
//



import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {

//        The FOR LOOP is there just for fun, to pop out more little windows if you want.
//        To do so just change the x in (x <= 1;)
        for (int x = 1; x <= 1; x++) {

            JFrame frame = new JFrame("Hello, Java!");
            JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
            frame.add( label );
            frame.setSize(300, 300);
            frame.setVisible(true);

        }

    }

}