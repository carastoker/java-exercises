
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

//    public int getInt(int min, int max, String message) {
//
//    }
//
}
