package Java2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cstoker on 5/22/17.
 */
public class StudentApp {

    public static void main(String[] args) {

//      import Input methods
        Input otherInput = new Input();
        boolean validInput;

        Map<String, Student> students = new HashMap();

        Student Bart = new Student("Bart");
        Bart.addGrade(93);
        Bart.addGrade(86);
        Bart.addGrade(78);
        Bart.addGrade(90);
//        students.put("git", Bart);

        Student Homer = new Student("Homer");
        Homer.addGrade(72);
        Homer.addGrade(74);
        Homer.addGrade(65);
        Homer.addGrade(60);
//        students.put("git", Homer);

        Student Lisa = new Student("Lisa");
        Lisa.addGrade(99);
        Lisa.addGrade(95);
        Lisa.addGrade(96);
        Lisa.addGrade(98);

        do {

            System.out.println("Welcome!\n\n" + "Here are the github usernames of our students:\n\n" +
                    "|" + Bart.getName() + "|" + Lisa.getName() + "|" + Homer.getName() + "|\n\n");

            do {

                validInput = true;

                String userInput = otherInput.getString("What student would you like to see more information on?");

                if (userInput.equalsIgnoreCase(Bart.getName())) {
                    System.out.println("Student: " + Bart.getName() + " Grade Average: " + Bart.getGradeAverage());
                } else if (userInput.equalsIgnoreCase(Homer.getName())) {
                    System.out.println("Student: " + Homer.getName() + " Grade Average: " + Homer.getGradeAverage());
                } else if (userInput.equalsIgnoreCase(Lisa.getName())) {
                    System.out.println("Student: " + Lisa.getName() + " Grade Average: " + Lisa.getGradeAverage());
                } else {
                    validInput = false;
                    System.out.println("Nope, that's not a student.");
                }

            } while (!validInput);


        } while (otherInput.yesNo("\n Would you like to continue? Y/N"));

    }
}

