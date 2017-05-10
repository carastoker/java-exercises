/**
 * Created by cstoker on 5/9/17.
 */

import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//     do while exercise --------------------
       int i = 0;

        while (i <= 100) {

            System.out.println("value of i is: " + i);

            i += 2;
        }

//        do exercise ----------------------
//        int i = 5;
//
//        while (i <= 15) {
//
//            System.out.println("value of i is: " + i);
//
//            i++;
//        }

//      buzzFizz exercise -----------------

//      initialise strings
        String buzz = "buzz";
        String fizz = "fizz";

//        for (int i = 1; i <= 100; ++i) {
//            if (i % 15 == 0) {
//                System.out.println("bizz" + "fizz " + i);
//            } else if (i % 3 == 0) {
//                System.out.println("buzz " + i);
//            } else if (i % 5 == 0) {
//                System.out.println("fizz " + i);
//            } else {
//                System.out.println(i);
//            }
//        }
    }
}

