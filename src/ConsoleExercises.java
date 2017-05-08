/**
 * Created by cstoker on 5/8/17.
 */

import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter your age");
//        int age = scan.nextInt();
//        System.out.println(age);
//
//        System.out.println("Enter your name");
//        String name = scan.nextLine();
//        System.out.println(name);
//
//        System.out.println("Enter your favorite language");
//        String lang = scan.nextLine();
//        System.out.println(lang);
//
//        System.out.println("Can you whistle");
//        String whistle = scan.nextLine();
//        System.out.println(whistle);
//
//        System.out.println("Do you prefer italian or indian food");
//        String food = scan.nextLine();
//        System.out.println(food);

        float height;
        float width;
        float length;


        System.out.println("Enter the height of your classroom");
        height = scan.nextFloat();
        System.out.println("Enter the width of your classroom");
        width = scan.nextFloat();
        System.out.println("Enter the length of your classroom");
        length = scan.nextFloat();

//      reference java printf( )
        System.out.println("Here are the room calculations");
        System.out.printf("area= %.2f sqft\n", length * width);
        System.out.printf("perimeter= %.2fft %.2fft\n", (2 * width),(2 * length));
        System.out.printf("volume= %.2f cu/ft\n", (length * height * width));

    }

}
