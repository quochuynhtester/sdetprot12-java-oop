package lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearning {
    public static void main(String[] args) {

        System.out.println("MENU");
        System.out.println("Input 0: Exit");
        System.out.println("Input 1: Random number in 1000");
        System.out.println("Input 2: Skip this turn");
        boolean myGame = true;
        while (myGame) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Pls input your choice: ");
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Your random number is:" + new SecureRandom().nextInt(1000));
            } else if (input == 2) {
                System.out.println("Skip this turn");
                continue;
            } else if (input == 0) {
                System.out.println("See you again");
                myGame = false;
//                break;
            } else {
                System.out.println("Pls input again!");
            }
        }
    }
}

