
package Java2;

import java.util.Scanner;

/**
 * Created by cstoker on 5/16/17.
 */

public class Input {

//    private Scanner scan;

//    this.scan =  = new Scanner(System.in);

    private Scanner scan = new Scanner(System.in);


    public String getString(String message) {

        System.out.println(message);
//      get input from user
        return scan.next();

    }

    public boolean yesNo(String message) {

        System.out.println(message);

        String answer = scan.next();

        if (answer.equalsIgnoreCase("Y")|| answer.equalsIgnoreCase("Yes")) {

            return true;

        } else if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("No")) {

            return false;

//      if user inputs anything other than Y/N
        } else {

            System.out.println("Invalid input!");

            return yesNo(message);
        }
    }

    public int getInt(int min, int max, String message, String invalidMes) {

        System.out.println(message);

            int guess;

        try {

            guess = Integer.valueOf(scan.next());

        } catch (NumberFormatException ex) {

            System.out.println("Exception thrown!");

            return getInt(min, max, message, invalidMes );
        }

        if (guess >= min && guess <= max) {

            return guess;

        }

            System.out.println(invalidMes);

        return getInt(min, max, message, invalidMes);

    }

    public int getInt(String message) {

        System.out.println(message);

        return scan.nextInt();

    }

    public double getDouble(double min, double max, String message) {

        System.out.println(message);

        double guess;

        try{

            guess = Double.valueOf(scan.next());

        } catch(NumberFormatException ex) {

            System.out.println("Throwing an exception!");

            return getDouble(min, max, message);
        }

        if (guess >= min && guess <= max) {

            System.out.println("That is right! Your number is within range.");

        }

            System.out.println("Nah, guess again. Your number is out of range!");

        return getDouble(min, max, message);

    }

    public double getDouble(String message) {

        System.out.println(message);

        return scan.nextDouble();

    }

}
