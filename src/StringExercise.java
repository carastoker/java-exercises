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
        input = scan.next();

        if(input.endsWith("!")) {
            message = "Whoa, chill out!' if you yell";
        } else {
            message = "speak up please!";
        }
            System.out.println(message);
    }

}

