package lab;

public class Lab_32 {
    public static void main(String[] args) {

//        Finding maximum value/minimum value from an integer array
        int[] myArray = {1, 2, 3, 4, 5};
        int minArray = myArray[0];
        int maxArray = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < minArray) {
                minArray = myArray[i];
            }
            if (myArray[i] > maxArray) {
                maxArray = myArray[i];
            }
        }
        System.out.println("Min array = " + minArray);
        System.out.println("Max array = " + maxArray);
    }
}

