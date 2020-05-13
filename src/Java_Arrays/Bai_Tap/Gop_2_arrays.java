package Java_Arrays.Bai_Tap;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Gop_2_arrays {
    public static void main(String[] args) {
        int size1;
        int size2;
        int[] arr1;
        int[] arr2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of arr1");
        size1 = scanner.nextInt();
        arr1 = new int[size1];

        int i = 0;
        while (i < arr1.length){
            System.out.print("Enter element" + (i + 1) + " : ");
            arr1[i]= scanner.nextInt();
            i++;
        }

        System.out.println("Input size of arr2");
        size2 = scanner.nextInt();

        arr2 = new int[size2];



        int j = 0;
        while (j < arr2.length){
            System.out.print("Enter element" + (j + 1) + " : ");
            arr2[j]= scanner.nextInt();
            j++;
        }
        System.out.println("Arr1");
        for (int val: arr1){
            System.out.print(val + "\t");
        }
        System.out.println("\nArr2");
        for (int val: arr2){
            System.out.print(val + "\t");
        }
        System.out.println("\n");


        int [] sum_2arr = new int[arr1.length+arr2.length];
        for(int val1=0; val1<arr1.length;val1++){
            sum_2arr[val1]= arr1[val1];
        }
        for(int val2=0;val2<arr2.length;val2++){
            sum_2arr[val2 + arr1.length]= arr2[val2];
        }


        System.out.println("Gop 2 arr result");
        for (int a: sum_2arr){
            System.out.print(a + "\t");
        }
    }
}
