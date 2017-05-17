package Java2;

/**
 * Created by cstoker on 5/17/17.
 */
public class InputTest {

    public static void main(String[] args) {

        Input otherInput = new Input();

        otherInput.getString("What is your name?");

//   ---------------------------------


        System.out.println(otherInput.yesNo("Would you like to visit Morocco? Y/N"));

//   --------------------------------

        otherInput.getInt(1, 7,"Guess a number");

    }

}
