package lesson_05;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {

//        List<Integer> myArrayList = new ArrayList<>();
        List<Integer> myArrayList2 = Arrays.asList(1, 2, 3, 4); //Array.asList has Fix length, ko the add, remove, duoc update

//Neu gia tri index cua ArrayList la Odd number thi set thanh Even number
        for (int index = 0; index < myArrayList2.size(); index++) {
            boolean result = myArrayList2.get(index) % 2 != 0;
            if (result) {
                myArrayList2.set(index, myArrayList2.get(index) + 1);
            }
        }
        System.out.println(myArrayList2);

//check xem myArrayList co value ko ?
        if (!myArrayList2.isEmpty()) {
            System.out.println("List size is " + myArrayList2.size());

//check xem myArrayList2 co chua vaule = 5 ko ?
            System.out.println(myArrayList2.contains(5));
        }
    }
}



