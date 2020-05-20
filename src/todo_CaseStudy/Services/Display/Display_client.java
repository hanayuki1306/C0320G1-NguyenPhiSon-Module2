package todo_CaseStudy.Services.Display;
import todo_CaseStudy.Services.implement_method.ImplementClient;
import java.util.Scanner;

public class Display_client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is client of Farama Resort, pls choice contact with this client");
        System.out.println("1.Display infomation of Service you want");
//        int input_choice = scanner.nextInt();

        //implement 1.
        new ImplementClient().Display_client();
        System.out.println("--------------------------------");

    }
}
