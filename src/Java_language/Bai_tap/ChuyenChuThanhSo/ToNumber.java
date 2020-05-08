package Java_language.Bai_tap.ChuyenChuThanhSo;

import java.util.Scanner;
import java.lang.*;

public class ToNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            long input = Long.parseLong(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Ban nhap ko phai la so");
        }

    }
}

