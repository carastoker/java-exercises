package Java2;

import java.util.Arrays;

/**
 * Created by cstoker on 5/18/17.
 */
public class MovieApp {

    public static void main(String[] args) {

        Input otherInput = new Input();

//      Pass MovieArray class to listArray
        MoviesArray listArray = new MoviesArray();

        Movie[] movieList = listArray.findAll();

        while (true) {
            System.out.println("Options:\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category \n");

//       pull in userInput and getInt methods from Input class
            int userInput = otherInput.getInt(0, 5, "To choose an option enter a number between 0-5!", "Nope, choose another option \n");

            System.out.println(userInput);


            switch (userInput) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    for (Movie o : movieList) {
                        System.out.println(o.findName() + " " + o.findCategory());
                    }
                    break;
            case 2:
//                findCategory(movieList, "Animated");
                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                break;
            }

        }

    }

//    public static void printEachCategory(Movie[], ) {
//    }
}


