package Lab;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//        =====MENU======
//        1. Add number into ArrayList
//        2. Print numbers
//        3. Get maximum number
//        4. Get minimum number
//        5. Search number
//        Optional: Add option number 5 to find a number -> index

public class Lab_41 {
    public static void main(String[] args) {

        boolean myProgram = true;
        while (myProgram) {
            printMenu();

            System.out.print("Pls input your number: ");
            Scanner scanner1 = new Scanner(System.in);
            int input = scanner1.nextInt();

            List<Integer> myArrayList = new ArrayList<>();

            if (input == 1) {
                myArrayList.add(getARandomNumber());
                System.out.println(getARandomNumber());
                return;
            } else if (input == 2) {
                for (Integer value : myArrayList) {
                    System.out.println(value);
                }
            } else if (input == 3) {
                int min = myArrayList.get(0);
                for (Integer index = 0; index < myArrayList.size(); index++) {
                    if (myArrayList.get(index) < min) {
                        min = myArrayList.get(index);
                    } else {
                        System.out.println("No min");
                    }
                }
            } else if (input == 4) {
                int max = myArrayList.get(0);
                for (Integer index = 0; index < myArrayList.size(); index++) {
                    if (myArrayList.get(index) > max) {
                        max = myArrayList.get(index);
                    } else {
                        System.out.println("No max");
                    }
                }
            } else if (input == 5) {
                System.out.print("Pls input number to search: ");
                Scanner scanner2 = new Scanner(System.in);
                int inputOption5 = scanner2.nextInt();
                for (Integer index = 0; index < myArrayList.size(); index++) {
                    if (inputOption5 == myArrayList.get(index)) {
                        System.out.println(index);
                    } else {
                        System.out.println("No search result");
                    }
                }
            } else {
                System.out.println("Pls select the right number in MENU and try again");
            }
        }
    }

    public static void printMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
    }

    public static int getARandomNumber() {
        return new SecureRandom().nextInt(100);
    }
}


