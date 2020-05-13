package Java_Arrays.Bai_Tap;

import java.util.Scanner;

public class Min_element_in_arr {
    public static void main(String[] args) {
        int size;
        int arr[];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap kich thuoc cua mang");
            size = scanner.nextInt();
            if (size > 50) {
                System.out.println("size too large, you shouldnt use ");

            }

        } while (size>50);

        arr = new int[size];

        System.out.println("Nhap vao phan cua mang");
        for (int i=0;i<arr.length;i++){
            System.out.println("Element" + (i+1) + " : ");
            arr[i] = scanner.nextInt();
        };

        System.out.println("Arr now");
        for(int i: arr){
            System.out.print(i + "\t");
        }
        System.out.println("");

        int res = find_min_element(arr);
        System.out.println("Min element of arrays is:" + res);
    }
    public static int find_min_element(int[] arr){
        int min= arr[0];
        for (int i=0; i<arr.length;i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
    return min;
    }
}
