package lesson_02;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
//  ngay mai ko mua thi di xem phim, mua thi o nha nau an

        System.out.println("chieu ngu day");
        System.out.println("nhin ra cua so.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Thoi tiet hom nay la: ");
        String hom_nay = scanner.next();

        final String ngay_mai = "mua";

        if (hom_nay .equals(ngay_mai)){
           System.out.println("thi o nha nau an");
           System.out.println("xuong nau do an");
           System.out.println("an toi");
       }
       else{
           System.out.println("thi di xem phim");
           System.out.println("xuong nau do an");
           System.out.println("an toi");
       }


        // Ternary operator | Toan tu ba ngoi
//        thuc_te = hom_nay.equals(ngay_mai) ? true : false;
//        System.out.println(hom_nay.equals(ngay_mai) ?"thi o nha nau an":"thi di xem phim");

    }
}

