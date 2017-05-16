package Java1; /**
 * Created by cstoker on 5/8/17.
 */

import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name;
//code skips when nextIn is combined with nextLine
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("Do you prefer Italian and French food or Indian and Thai food\n");
        String food = scan.next();
        System.out.printf("I like ",food);


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
        System.out.printf("Area = %.2f sqft\n", length * width);
        System.out.printf("Perimeter = %.2fft %.2fft\n", (2 * width), (2 * length));
        System.out.printf("Volume = %.2f cu/ft\n", (length * height * width));


    }

}
