package Java_language.Thuc_hanh.SuDungToanTu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Width");
        width = Float.parseFloat(scanner.nextLine());
        System.out.println("input Height");
        height = Float.parseFloat(scanner.nextLine());
        System.out.println(height);
        float arena = width * height;
        System.out.println("arena = " + arena );
    }
}
