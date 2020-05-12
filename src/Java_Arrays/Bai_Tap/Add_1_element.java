package Java_Arrays.Bai_Tap;

import java.util.Scanner;

public class Add_1_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size_of_arr;
        int arr[];


        do {
            System.out.println("Input size of arrays you want add");
            size_of_arr = scanner.nextInt();
            if (size_of_arr > 50) {
                System.out.println("size too large");
            }
        } while (size_of_arr>50);

        arr = new int[size_of_arr];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }

        System.out.println("This arr now: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println("input X is variable you need push");
        int X = scanner.nextInt();
        System.out.println("pls input the indexof X you want push");
        int indexOf = scanner.nextInt();
        arr_return(arr,X,indexOf);


        System.out.println("This is arr after push:");
        for (int e: arr){
            System.out.println(e);
        }
    }

    // [1,3,4,6] chen 10 vao vi tri thu 3
//    [1,3,10,4,6]
    public static int[] arr_return(int [] arr, int X, int indexofX){
        if (indexofX <=1 || indexofX > arr.length-1){
            System.out.println("Cant input X cause index have problem");
        } else {
            for (int i=indexofX;i <arr.length;i++){
                    arr[indexofX-1] = X;
            }
            arr[indexofX] = arr[indexofX+1];
            return arr;
        }
        return arr;
    }
}
