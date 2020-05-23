package Test_java;

import CaseStudyModule2JavaCore.Exception.NameException;

import java.util.Scanner;

public class testException {
    public void testthrow() throws NameException{
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        System.out.println(input);
    }
}
