package Lesson_01;

public class VariableLesson {
    public static void main(String[] args) {

        short my_num = 128;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // float: %f
        float my_num_float = 3.14f;
        System.out.println(my_num_float);

        //double: %D
        double my_num_double = 3.14D;
        System.out.println(my_num_double);

        //final: fix value, not changed
        final long my_num_long = 10L;
        System.out.println(my_num_long);
    }
}
