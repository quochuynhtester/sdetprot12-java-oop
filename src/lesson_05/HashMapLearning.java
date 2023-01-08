package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {

        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "canh sat");
        emergencyList.put(114, "cuu hoa");
        emergencyList.put(115, "cap cuu");
        emergencyList.put(116, "others");
        emergencyList.put(117, "something else");

//        Read key
        System.out.println(emergencyList.get(113));
        System.out.println(emergencyList.get(118));

//        Can not loop Map to print, loop key then print
        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }

//        Check Map contain key / value
        System.out.println("key 113 is " + emergencyList.containsKey(113));
        System.out.println("cuu hoa is " + emergencyList.containsValue("cuu hoa"));

//        Update key follow value
        emergencyList.replace(113, "cap cuu");
        System.out.println(emergencyList.get(113));
        emergencyList.replace(113, "cap cuu", "chay nha");
        System.out.println(emergencyList.get(113));

//        update map follow value
        for (Integer key2 : emergencyList.keySet()) {
            if (emergencyList.get(key2).equals("others")) {
                emergencyList.replace(key2, "something else 2");
            }
            System.out.println(emergencyList.get(key2));
        }
    }
}
