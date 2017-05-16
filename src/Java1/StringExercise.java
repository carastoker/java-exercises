package Java1;

import java.util.Scanner;

/**
 * Created by cstoker on 5/11/17.
 */
public class StringExercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input;

        String answer;

        System.out.println("Chat with Bob the teenager");
        input = scan.nextLine();


        if (input.endsWith("?")) {
            answer = "Sure.";

        } else if (input.trim().isEmpty()) {
            answer = "Fine. Be that way!";

        } else if (input.endsWith("!") || input.toUpperCase().equals(input) && !input.toLowerCase().equals(input)) {
            answer = "'Whoa, chill out!";

        } else {
            answer = "Whatever";
        }

        System.out.println(answer);
    }

}