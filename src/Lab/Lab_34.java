package Lab;

import java.util.Arrays;

public class Lab_34 {
    public static void main(String[] args) {

//        Merge 2 SORTED integer array into one SORTED array
//        Array 01: {1, 12, 16, 28, 34}
//        Array 02: {1, 13, 16, 27, 99}

        int[] array01 = {1, 12, 16, 28, 3};
        int[] array02 = {1, 13, 16, 27, 99};
//        method 1
//        int[] resultArray = new int[array01.length + array02.length];
//        int pos = 0;
//
//        for (int i1 : array01) {
//            resultArray[pos] = i1;
//            pos++;
//        }
//        for (int i2 : array02) {
//            resultArray[pos] = i2;
//            pos++;
//        }
//        Arrays.sort(resultArray);
//        System.out.println(Arrays.toString(resultArray));

//        method 2
        int[] resultArray = new int[array01.length + array02.length];
        System.arraycopy(array01, 0, resultArray, 0, array01.length);
        System.arraycopy(array02, 0, resultArray, array01.length, array02.length);
        Arrays.sort(resultArray);
        System.out.println(Arrays.toString(resultArray));
    }
}
