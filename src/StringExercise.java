import java.util.Scanner;

/**
 * Created by cstoker on 5/11/17.
 */
public class StringExercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input;

        String message;

        System.out.println("Enter a statement");
        input = scan.nextLine();

        if(input.equals("")) {
            message = "Fine. Be that way!";
        } else {
            message = "other stuff!";
        }
            System.out.println(message);
    }

}

