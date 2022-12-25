package Lesson_02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {

        // < 18: khong ban |18 =< - <=55: unlimitted| >= 55: 2 chai

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls input your age: ");
        int client_age = scanner.nextInt();

        if (client_age < 18){
            System.out.println("Khong ban");
            if (client_age < 12){
                System.out.println("Call 113");
            }

        } else if (client_age >= 18 && client_age <= 55) {
            System.out.println("Unlimitted");
        } else {
            System.out.println("2 chai");
        }
    }
    }

