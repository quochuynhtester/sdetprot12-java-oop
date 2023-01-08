package lesson_04;

import java.util.Scanner;

public class SwitchCaseBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls input your number: ");
        int input = scanner.nextInt();
//
//        switch (input) {
//            case 1:
//                System.out.println("Giat nhat");
//                break;
//            case 2:
//                System.out.println("Giai nhi");
//                break;
//            default:
//                System.out.println("Good luck next time");

        switch (input) {
            case 1:
            case 2:
            case 3:
                System.out.println("Co giai thuong");
                break;
            default:
                System.out.println("Good luck next time");
        }
    }
}
