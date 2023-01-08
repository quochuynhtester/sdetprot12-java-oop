package lesson_03;

public class ArrayLearning {
    public static void main(String[] args) {

        int arrayLength = 10;
        int[] myArray = new int[arrayLength];

        for (int index = 0; index < arrayLength; index++) {
            myArray[index] = index + 1;
        }

        myArray[arrayLength - 1] = 100;

        for (int index = 0; index < arrayLength; index++) {
            System.out.printf("The index %d has value %d\n", index, myArray[index]);
        }

        for (int i:myArray){
            System.out.println(i);
        }
    }
}
