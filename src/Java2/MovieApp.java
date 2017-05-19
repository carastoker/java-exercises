package Java2;

/**
 * Created by cstoker on 5/18/17.
 */
public class MovieApp {

    public static void main(String[] args) {

        Input otherInput = new Input();

        System.out.println("Choose an option!");

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category ");

        int userInput = otherInput.getInt(0, 5, "Enter a number between 0-5", "Nope, choose another option");

        System.out.println(userInput);


        switch (userInput) {
            case 0:
                System.exit(0);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }


    }
}


