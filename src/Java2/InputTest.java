package Java2;

/**
 * Created by cstoker on 5/17/17.
 */
public class InputTest {

    public static void main(String[] args) {

        Input otherInput = new Input();

        otherInput.getString();

        Input inputYesNo = new Input();

        System.out.println("Would you like to visit Morocco? Y/N");

        System.out.println(inputYesNo.yesNo());
    }


}
