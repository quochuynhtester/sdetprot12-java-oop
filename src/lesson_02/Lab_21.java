package lesson_02;

import java.util.Scanner;

public class Lab_21 {
    public static void main(String[] args) {
        System.out.print("Pls input your weight (kg): ");
        Scanner scanner1 = new Scanner(System.in);
        float weight = scanner1.nextFloat();

        System.out.print("Pls input your height (m): ");
        Scanner scanner2 = new Scanner(System.in);
        float height = scanner2.nextFloat();

        float BMI = weight / (height * 2f);
//        18,5 <= bmi | 18,5<= bmi <=24,9 | 25 <= bmi <=29,9.

        if (BMI <= 18.5){
            System.out.println("Underweight");
            System.out.println("You should increase your weight");
            
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Normal weight");
            System.out.println("You are in good shape");

        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Obesity");
            System.out.println("You should decrease your weight");

        } else {
            System.out.println("Invalid value. Pls input again your information");
        }
    }
}
