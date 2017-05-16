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

//        System.out.println(personUno.getName().equals(personDos.getName()));
//        System.out.println(personUno == personDos);


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jaime");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}
