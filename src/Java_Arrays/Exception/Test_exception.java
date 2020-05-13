package Java_Arrays.Exception;

import java.io.EOFException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_exception {
    public static void main(String[] args) {
        try {
            int i;
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();

        } catch (Exception e){
            System.out.println("Input wrong");
        }
//        catch (RuntimeException e1){
//            System.out.println("lllllllllllllllll");
//        }
    }
}
