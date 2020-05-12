package Java_language.Bai_tap.ChuyenChuThanhSo;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.lang.*;

public class ToNumber {

    public static void main(String[] args) {

        int inputs = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number: ");

            try {
                inputs = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Ban nhap ko phai la so");
            }
        };

        if (inputs <16){
            switch_value_day(inputs);
        } else if (inputs >= 16 && inputs <20){
            int check = inputs%10;
//            System.out.println("gia tri cua check: " + check);
            switch_value_day(check); ;
            System.out.println("teen");
        } else if (inputs >20 && inputs <100){
            int hangchuc = inputs/10;
            int hang_don_vi = inputs%10;
            if (hang_don_vi == 0){
                System.out.println("");
                switch_hang_chuc(hangchuc);
            } else {
                switch_hang_chuc(hangchuc);
                System.out.print("-");
                switch_value_day(hang_don_vi);
            }
        } else if (inputs>=100){
            int hangtram = inputs/100;
            int hangchuc = inputs/10;
            int hangdonvi = inputs%10;

            if (hangchuc%10 ==0) {
                switch_value_day(hangtram);
                System.out.println(" Hundred");
            } else {
                switch_value_day(hangtram);
                System.out.print(" Hundred and ");
                if (hangchuc%10 == 1 ){
//                    switch_value_day(hangdonvi);
////                    System.out.println("debug hang don vi:" +hangdonvi);
////                    System.out.println("debug hang chuc:" +hangchuc%10);
                }
                if (hangdonvi == 0){
                    System.out.print("");
                    switch_hang_chuc(hangchuc%10);
                } else {
                    switch_hang_chuc(hangchuc%10);
                    System.out.print("-");
                    switch_value_day(hangdonvi);
                }
            }

        }
    }


    public static void switch_hang_chuc(int value){
        switch (value) {
            case 1:
                System.out.print("Ten");
                break;
            case 2:
                System.out.print("Twenty");
                break;
            case 3:
                System.out.print("Thirty");
                break;
            case 4:
                System.out.print("Fourty");
                break;
            case 5:
                System.out.print("Fifty");
                break;
            case 6:
                System.out.print("Sixty");
                break;
            case 7:
                System.out.print("Seventy");
                break;
            case 8:
                System.out.print("Eighty");
                break;
            case 9:
                System.out.print("Ninety");
                break;
        }
    }

    public static void switch_value_day(int value){
        switch (value) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
            case 10:
                System.out.print("Ten");
                break;
            case 11:
                System.out.print("Eleven");
                break;
            case 12:
                System.out.println("Twelve");
                break;
            case 13:
                System.out.println("Thirteen");
                break;
            case 14:
                System.out.println("Fourteen");
                break;
            case 15:
                System.out.println("fifteen");
                break;
            default:
                System.out.println("sr i cant help");
                
        };
    };
}


