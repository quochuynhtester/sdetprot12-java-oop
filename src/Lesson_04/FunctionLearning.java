package Lesson_04;

import java.security.SecureRandom;

public class FunctionLearning {
    public static void main(String[] args) {

        printNumber();
        sayHello("Quoc Huynh");
        sayHello("Le Hien");
        System.out.println(getARandomNumber());
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static int getARandomNumber() {
        return new SecureRandom().nextInt(100);
    }

    public static void printNumber() {
        for (int index = 0; index < 10; index++) {
            if (index == 8) return;
            else System.out.println(index);
        }
    }
}
