/**
 * Created by cstoker on 5/9/17.
 */

import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//      do exercise ------------------------------------------------- refactor to a for loop
//
//        for (int i = 5; i <= 15; i++) {
//
//            System.out.println("value of i is: " + i);
//        }

//      do while exercise one -------------------------------------- refactor to a for loop

        for (int i = 100;  i >= -10; i -= 5) {

            System.out.println("value of i is: " + i);
        }

//      do while exercise two  --------------------------------------

//        int i = 2;
//
//        do {
//
//            System.out.println("value of i is: " + i);
//            i *= 2;
//
//        } while (i <= 1000000);

//      buzzFizz exercise ----------------------------------------------

//      initialise strings
//        String buzz = "buzz";
//        String fizz = "fizz";

//        for (int i = 1; i <= 100; ++i) {
//            if (i % 15 == 0) {
//                System.out.println("buzz" + "fizz " + i);
//            } else if (i % 3 == 0) {
//                System.out.println("buzz " + i);
//            } else if (i % 5 == 0) {
//                System.out.println("fizz " + i);
//            } else {
//                System.out.println(i);
//            }
//        }

//      display a table of powers -----------------------------------------
//
//            int number;
//            int squared;
//            int cubed;
//            String yesNo;
//
//        do {
//            System.out.println("Enter a number: ");
//            number = scan.nextInt();
//
//            for (int i = 1; i <= number; ++i) {
//                squared = i * i;
//                cubed = i * i * i;
//                System.out.println(i + " | " + squared + " | " + cubed);
//                System.out.println("\n");
//            }
//
//            System.out.println("Would you like to continue? (Y/N)");
//            yesNo = scan.next();
//
//        } while ("Y".equalsIgnoreCase(yesNo));

//        convert grades --------------------------------------------------------------

//        System.out.println("Pick a number between 0 - 100");
//        number = scan.nextInt();


    }
}

