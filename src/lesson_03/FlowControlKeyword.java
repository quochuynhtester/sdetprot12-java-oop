package lesson_03;

public class FlowControlKeyword {
    public static void main(String[] args) {

//        flow control: BREAK
        for (int ibreak = 0; ibreak < 10; ibreak++) {
            System.out.println(ibreak);
            if (ibreak==3) break;
        }
//        flow control: CONTINUE
        for (int icontinue = 0; icontinue < 10; icontinue++) {
            if (icontinue==3) continue;
            System.out.println(icontinue);
        }
    }

}
