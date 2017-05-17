
package Java2;

import java.util.Scanner;

/**
 * Created by cstoker on 5/16/17.
 */
public class Input {

    private String salutation;

    private static Scanner scan = new Scanner(System.in);


    public String getString() {

        System.out.println("What is your name?");
        return scan.next();

    }

   public boolean yesNo() {

        String answer = scan.next();

        if(answer.equalsIgnoreCase("Y")) {

            return true;

        } else

            return false;

   }
}
