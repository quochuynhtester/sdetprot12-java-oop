package Lesson_02;

public class PrefixPostfix {
    public static void main(String[] args) {

        int a = 1;
        int b =2;
        int result = ++a + b++;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

        //prefix 1st > right operand > assign value to left operand > post fix
    }
}
