package Java_language.Bai_tap.ChuyenDoiTienTe;


import java.util.Scanner;

public class VndToUSD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input money to exchange:");
        short money = Short.parseShort(scanner.nextLine());
        System.out.println("Input rate ");
        float rate = Float.parseFloat(scanner.nextLine());

//        System.out.println("So tien quy doi");
        float res = money*rate;
        System.out.printf("Total money From %sUSD to vietname : %.1f ",money,res);
    }
}
