package lesson_02;

import java.util.Scanner;

public class Lab_22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls input a number: ");

        float result = scanner.nextFloat() % 2f;

        if (result == 0){
            System.out.println("This is even number");
        } else {
            System.out.println("This is odd number");
        }
    }
}