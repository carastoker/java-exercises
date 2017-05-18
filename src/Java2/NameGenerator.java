package Java2;



/**
 * Created by cstoker on 5/18/17.
 */
public class NameGenerator {

    public static Input input = new Input();

    public static String [] color = { "blue", "green", "yellow", "orange", "black", "ruby", "white", "rainbow", "gray", "gold"};

    public static String [] noun = { "liger", "buffalo", "unicorn", "rabbit", "tiger", "dragon", "bear", "mermaid", "griffen", "direwolf"};


    public static String arrayShuffle(String [] words) {

        int random = (int) (Math.random() * words.length);

        return words[random];
    }

    public static String getName() {

        String name = arrayShuffle(color) + " " + arrayShuffle(noun);

        return name;
    }

}
