package Java2;

/**
 * Created by cstoker on 5/22/17.
 */
public class StudentApp {

    public static void main(String[] args) {

        Student one = new Student("Bart");
        one.addGrade(93);
        one.addGrade(86);
        one.addGrade(78);
        one.addGrade(90);

        System.out.println(one.getGradeAverage());

    }
}

