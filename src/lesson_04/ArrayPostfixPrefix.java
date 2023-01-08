package lesson_04;

public class ArrayPostfixPrefix {
    public static void main(String[] args) {

        int[] myArray = new int[]{9, 9, 9, 9, 9};
        for (int i = 0; i < 5; i++) {
            myArray[i] = i++;
        }
        for (int i : myArray) {
            System.out.println(i);
        }
    }
}

