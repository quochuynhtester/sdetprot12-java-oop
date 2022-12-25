package Lesson_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

//        Guess 1 random number in(5), have 3 chance
        int randomNumber = new SecureRandom().nextInt(5);
        System.out.println("Random number is: " + randomNumber);
        int chance = 0;

        do {
            System.out.print("Pls input your number: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            if (input == randomNumber) {
                System.out.println("Congrazt, You are lucky!");
                break;
            }
            chance++;
        } while (chance < 3);
        System.out.println("See you again!");
    }
}
