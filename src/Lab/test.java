package Lab;

import java.security.SecureRandom;

public class test {
    public static void main(String[] args) {
        getARandomNumber();
        System.out.println(getARandomNumber());
    }
    public static int getARandomNumber() {
        return new SecureRandom().nextInt(Integer.MAX_VALUE);

    }
}
