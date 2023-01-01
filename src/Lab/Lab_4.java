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

public class Lab_4 {
    public static void main(String[] args) {

        List<Integer> myArrayList = new ArrayList<>();

        for (; ; ) {
            printMenu();
            System.out.print("Pls input your number: ");
            Scanner scanner1 = new Scanner(System.in);
            int input = scanner1.nextInt();
            final int randomNumber = getARandomNumber();

            if (input == 1) {
                myArrayList.add(randomNumber);
                System.out.println(randomNumber);
            }
            if (input == 2) {
                for (int index = 0; index < myArrayList.size(); index++) {
                    System.out.println(myArrayList.get(index));
                }
            }
            if (input == 3) {
                int min = myArrayList.get(0);
                for (int index = 0; index < myArrayList.size(); index++) {
                    if (myArrayList.get(index) < min) {
                        min = myArrayList.get(index);
                    }
                }
                System.out.println("min is " + min);
            }
            if (input == 4) {
                int max = myArrayList.get(0);
                for (int index = 0; index < myArrayList.size(); index++) {
                    if (myArrayList.get(index) > max) {
                        max = myArrayList.get(index);
                    }
                }
                System.out.println("max is " + max);
            }
            if (input == 5) {
                System.out.print("Pls input number to search: ");
                Scanner scanner2 = new Scanner(System.in);
                int searchNumber = scanner2.nextInt();

                int resultSearch = searchNumber;

                for (int index = 0; index < myArrayList.size(); index++) {
                    if (myArrayList.get(index) == searchNumber) {
                        resultSearch = index;
                    }
                }
                System.out.println("Index of search number is " + resultSearch);
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





