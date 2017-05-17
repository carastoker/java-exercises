
package Java2;

import java.util.Scanner;

/**
 * Created by cstoker on 5/16/17.
 */
public class Input {

    private String salutation;

    private static Scanner scan = new Scanner(System.in);


    public String getString(String message) {
        System.out.println(message);
        return scan.next();

    }

    public boolean yesNo(String message) {

        System.out.println(message);

        String answer = scan.next();

        if (answer.equalsIgnoreCase("Y")) {

            return true;

        } else if (answer.equalsIgnoreCase("n")) {

            return false;

//      if user inputs anything other than Y/N
        } else {

            System.out.println("Invalid input!");

            return yesNo(message);
        }
    }

    public int getInt(int min, int max, String message) {

        System.out.println(message);

        int guess = scan.nextInt();

        if (guess >= min && guess <= max) {

            System.out.println("That's right!");

            return guess;

        } else

            System.out.println("Nope! Guess again");

        return getInt(min, max, message);

    }

    public int getInt(String message) {

        System.out.println(message);

        return scan.nextInt();

    }

    public double getDouble(double min, double max, String message) {

        System.out.println(message);

        double guess = scan.nextDouble();

        if (guess >= min && guess <= max) {

            System.out.println("That is right!");

        } else

            System.out.println("Nah, guess again!");

        return getDouble(min, max, message);

    }

    public double getDouble(String message) {

        System.out.println(message);

        return scan.nextDouble();

    }

}
