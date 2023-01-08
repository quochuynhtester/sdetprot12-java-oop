package lesson_05;

public class StringLearning {
    public static void main(String[] args) {

        String myname1 = "teo"; //literal declaration: khai bao tuong minh
        String myname2 = "teo"; //literal declaration: khai bao tuong minh
        String myname3 = new String("teo"); // via String object

        System.out.println("myname1 = myname2: " + (myname1.equals(myname2))); //String always use equals for comparation
        System.out.println("myname1 = myname3: " + (myname1.equals(myname3))); //String always use equals for comparation

        //check lowercase, uppercase, digit...
        String password = "123abcDEF";
        char[] passwordArray = password.toCharArray();

        int totalDigit = 0;
        int totalLowerCase = 0;
        int totalUpperCase = 0;

        for (char character : passwordArray) {
            if (Character.isDigit(character)) totalDigit++;
            else if (Character.isLowerCase(character)) totalLowerCase++;
            else if (Character.isUpperCase(character)) totalUpperCase++;
        }
        if (totalDigit > 0 && totalLowerCase > 0 && totalUpperCase > 0) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is invalid");
        }
    }
}
