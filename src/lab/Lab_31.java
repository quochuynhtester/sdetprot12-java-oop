package lab;

public class Lab_31 {
    public static void main(String[] args) {

//        Count how many odd, even number(s) in an integer array
        int[] myArray = {1, 2, 3, 4, 5};
        int oddNumber = 0;
        int evenNUmber = 0;

        for (int valueArray = 0; valueArray < myArray.length; valueArray++) {
            int result = myArray[valueArray] % 2;
            if (result != 0) {
                oddNumber++;
            } else {
                evenNUmber++;
            }
            System.out.println("Total odd number of this array is: " + oddNumber);
            System.out.println("Total even number of this array is: " + evenNUmber);
        }
    }
}
