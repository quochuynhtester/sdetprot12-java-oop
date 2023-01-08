package lesson_05;

import java.util.*;

public class RemoveDuplicatedValue {
    public static void main(String[] args) {

        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(6);
        myArrayList.add(5);
        myArrayList.add(5);
        myArrayList.add(4);
        myArrayList.add(10);
        myArrayList.add(1);

//lay ra 3 so min ko duplicated, sort
        Set<Integer> removeDuplicatedAndSort = new HashSet<>(myArrayList);
        myArrayList = new ArrayList<>(removeDuplicatedAndSort);
        System.out.println(myArrayList);
        System.out.println(myArrayList.subList(0, 3)); // 3 is boundary value: just include 0,1,2

//ko dung utility method
        for (Integer number : myArrayList) {
            if (!myArrayList.contains(number)) {
                myArrayList.add(number);
            }
            Collections.sort(myArrayList);
            System.out.println(myArrayList.subList(0, 3)); // 3 is boundary value: just include 0,1,2
        }
    }
}
