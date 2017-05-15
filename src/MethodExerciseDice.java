/**
 * Created by cstoker on 5/12/17.
 */

import java.util.Scanner;
import java.lang.*;

public class MethodExerciseDice {


    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String rollAgain;

        do {
            int sides = getSides();
            System.out.println(rollDice(sides));
            System.out.println(rollDice(sides));

            System.out.println("Roll again?(Y/N)");
            rollAgain = scan.next();

        } while (rollAgain.equalsIgnoreCase("Y"));

    }

//  prompts user to choose number of dice sides
    public static int getSides() {

        System.out.println("Let's roll the dice! How many sides do you want your dices to have?");
        return scan.nextInt();
    }

//  creates random math for dice roll
    public static int rollDice(int max) {

        int dice = (int) (Math.round(Math.random() * (max - 1)) + 1);

        return dice;

    }

}

