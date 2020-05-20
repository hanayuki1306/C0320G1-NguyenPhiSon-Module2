package CaseStudyModule2JavaCore.Controller;

import java.util.Scanner;

public class MainController {
    public static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu(){

        System.out.println("This is client of Farama Resort, pls choice contact with this client by input number");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("1. Add New Services");
        System.out.println("2. SQLOutput");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employee");
        System.out.println("7. Exit");
    }

    public static void addNewServices(){
        System.out.println("Pls input ur services you want add:");
        System.out.println("----------------------------------");
        int input = scanner.nextInt();
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
        System.out.println("5. Exit");
    };
}
