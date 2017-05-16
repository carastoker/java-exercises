package Java1;
/**
 * Created by cstoker on 5/11/17.
 */

import java.util.Scanner;

public class MethodExercisesArithmetic {

    //  include scanner to enable user input
    private static Scanner scan = new Scanner(System.in);

    //  set range of numbers user can input
    private static int min = 0;
    private static int max = 10;
//  private static String yesNo;

    public static int getUserInput() {

//      prompt user for numbers
        System.out.println("Enter a number between " + min + " and " + max + "to perform arithmetic operation on.");

//      grab users input
        int userInput = scan.nextInt();

//      if user input is within set range continue
        if (userInput >= min && userInput <= max) {

            return userInput;

        } else {

//          if not within range return them to number getUserInput prompt
            System.out.println("Not a valid number");
            return getUserInput();
        }
    }

//  allow user to choose math operation to apply to the numbers they select
    public static int getOperation() {

        System.out.println("Which math operator would you like to use on these numbers: +, -, /, x, % ? ");
        String userInput = scan.next();

        switch(userInput) {

            case "+":
                return addition(getUserInput(), getUserInput());

            case "-":
                return subtraction(getUserInput(), getUserInput());

            case "/":
                return division(getUserInput(), getUserInput());

            case "x":
                return multiplication(getUserInput(), getUserInput());

            case "%":
                return modulus2(getUserInput(), getUserInput());

            default:
                System.out.println("Nope!");
                return getOperation();

        }
    }

    public static int checkForZero(int num) {

//      if user tries to divide by 0, fire a prompt msg, and send them back to previous prompt
        if (num == 0) {
            System.out.println("Can not divide by zero, please try again");
            num = getUserInput();
//          if user tries to divide by 0 again run this field again until user gives up, otherwise run as usual!
            if (num == 0) {
                return checkForZero(num);
            } else {
                return num;
            }
        } else {
            return num;
        }
    }
//  math operations
    public static int addition(int number1, int number2) {

        return number1 + number2;
    }

    public static int subtraction(int number1, int number2) {

        return number1 - number2;
    }

    //
    public static int multiplication(int number1, int number2) {

        return number1 * number2;
    }

    public static int division(int number1, int number2) {
        number1 = checkForZero(number1);
        number2 = checkForZero(number2);

        return number1 / number2;

    }

    public static int modulus2(int number1, int number2) {

        return number1 % number2;
    }

    public static void main(String[] args) {

            System.out.println(getOperation());
        }

    }
