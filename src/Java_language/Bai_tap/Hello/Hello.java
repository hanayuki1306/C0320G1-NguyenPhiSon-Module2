package Java_language.Bai_tap.Hello;

import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello: " + name);
    }

}
