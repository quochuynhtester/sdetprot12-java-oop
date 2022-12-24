package lesson_03;

import lesson_01.Hello;

public class ForLoopLearning {
    public static void main(String[] args) {

        int maxNumber = 10;
        for (int index = 0; index < maxNumber; index++) {
            System.out.println(index);
        }
//        infinity loop: condition alway TRUE
//        for (; ; ) {
//            System.out.println("condition is TRUE");
//        }

////       infinity loop: no put trigger
//        for (int i = 0; i < maxNumber; ) {
//            System.out.println("no put trigger");
//        }
////        NO infinity loop: excute trigger in body, put var out of command
//        int iOutCommand = 0;
//        for (; iOutCommand < maxNumber; ) {
//            iOutCommand++;
//            System.out.println("NO Loop: trigger in body");
//        }
    }
}
