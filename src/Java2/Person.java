package Java2;

/**
 * Created by cstoker on 5/16/17.
 */
public class Person {

    private String name;


//  constructor
    public Person(String personName) {

        this.name = personName;
    }

//  getter
    public String getName() {
        return name;
    }

//  setter
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {

        System.out.println("Hello, " + name);
    }

    public void sayGoodbye() {
        System.out.println("Seeya later, " + name + "!");
    }


}
