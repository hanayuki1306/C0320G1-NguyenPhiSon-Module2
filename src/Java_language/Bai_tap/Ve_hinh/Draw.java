package Java_language.Bai_tap.Ve_hinh;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int choice= -1;

        while(choice!=0){
            Scanner input = new Scanner(System.in);


            System.out.println("Menu");
            System.out.println("1. Ve tam giac can");
            System.out.println("2. Ve tam giac vuong");
            System.out.println("3. Ve hinh chu nhat");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Tam giac can");
                    for(int i=7;i>=1;i--){
                        for(int j=2;j<=i;j++) {
                            System.out.print("* ");
                        };
                        System.out.println("*");
                    };
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Tam giac vuong");
                    for(int i=1; i<=5; i++) {
                        for (int j = 1; j < i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("* ");
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Hinh chu nhat");
                    for (int i =1;i<5; i++){
                        for (int j = 8;j>0;j--){
                            System.out.print("*");
                        }
                        System.out.println("");

                    }
//                    System.out.println("*");
                    break;
                case 0:
                    System.exit(0);
//                    choice =0 ;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
