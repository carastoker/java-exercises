package Java2;

/**
 * Created by cstoker on 5/16/17.
 */
public class PersonApp {

    public static void main(String[] args) {

        Person personUno = new Person("Jubal");
        Person personDos = new Person("Valentine");

//        personUno.sayHello();
//        personDos.sayGoodbye();

        System.out.println(personUno.getName().equals(personDos.getName()));
        System.out.println(personUno == personDos);

    }
}
