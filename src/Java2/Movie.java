package Java2;


/**
 * Created by cstoker on 5/18/17.
 */

public class Movie {


    private String name;

    private String category;

//  constructor
    public Movie(String n, String c) {

        this.name = n;

        this.category = c;

    }

    public String findName() {
        return this.name;

    }

    public String findCategory() {
        return this.category;
    }

}
