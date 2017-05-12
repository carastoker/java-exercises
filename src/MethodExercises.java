import java.util.Scanner;

/**
 * Created by cstoker on 5/11/17.
 */
public class MethodExercises {

    private static Scanner scan = new Scanner(System.in);

    public static int getUserInput(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max);
        return scan.nextInt();
    }

    public static int addition(int number1, int number2) {
        return number1 + number2;
    }

    //
    public static int subtraction(int x, int y) {
        return x - y;
    }
//
    public static int multiplication(int c, int s) {
        return c * s;

    }
//
    public static int division(int n, int m) {
        return n / m;
    }

    public static int modulus2(int o, int p) {
        return o % p;
    }

    public static void main(String[] args) {
        int userInput1 = getUserInput(1, 10);
        int userInput2 = getUserInput(1, 10);
        System.out.println(division(userInput1, userInput2));
    }
    
}
