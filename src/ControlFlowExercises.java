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

//        for (int i = 100;  i >= -10; i -= 5) {
//
//            System.out.println("value of i is: " + i);
//        }

//      do while exercise two  -------------------------------------- refactor to a for loop

//        for (int i = 2; i <= 1000000; i *= 2) {
//            System.out.println("value of i is: " + i);
//        }

//      buzzFizz exercise ----------------------------------------------
//
//      initialise strings
//        String buzz = "buzz";
//        String fizz = "fizz";
//
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
////
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

        int A;
        int B;
        int C;
        int D;
        int F;
        int grade = 0;
        String yesNo;


        do {

        System.out.println("Pick a number between 0 - 100: ");
        int numGrade = scan.nextInt();

            if ((numGrade >= 88) && (numGrade <= 100)) {
                System.out.println("A");
            } else if ((numGrade >= 80) && (numGrade <= 87)) {
                System.out.println("B");
            } else if ((numGrade >= 67) && (numGrade <= 79)) {
                System.out.println("C");
            } else if ((numGrade >= 60) && (numGrade <= 66)) {
                System.out.println("D");
            } else if ((numGrade >= 0) && (numGrade <= 59)) {
                System.out.println("F");
            } else
                System.out.print(grade);

            System.out.println("\n");

            System.out.println("Would you like to continue? (Y/N)");
            yesNo = scan.next();

        } while ("Y".equalsIgnoreCase(yesNo));

    }
}

