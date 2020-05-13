package Java_Arrays.Bai_Tap;

import java.util.Scanner;

public class Delete_1_element {
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
        System.out.println("\n");

        System.out.println("pls input the variable you want delete");
        int element_delete = scanner.nextInt();


        int arr_res[] = delete_element(arr,element_delete);

        System.out.println("This is arr after delete:");
        for (int e: arr_res){
            System.out.println(e);
        }
    }

    // [1,2,3,4,5,6,7]
    // xoa 4

    public static int[] delete_element(int [] arr, int variable_delete) {
        int arr_result[] = new int[arr.length - 1];
        boolean check = false;
        for (int i=0; i<arr.length;i++){
            if( arr[i]== variable_delete ){
                check = true;
            };
        }

        if (check){
            for (int i=0;i<arr.length;i++){
                if (arr[i] == variable_delete){
                    int index_delete= i;
                    for (int j=0; j<index_delete;j++){
                        arr_result[j]= arr[j];
                    }
                    for (int value_ater_variable_del = index_delete;value_ater_variable_del<arr_result.length;value_ater_variable_del++ ){
                        arr_result[value_ater_variable_del] = arr[value_ater_variable_del+1];
                    };
                }
            }
            return  arr_result;
        } else {
            System.out.println("Khong tim thay phan tu muon xoa trong mang");
            System.exit(0);
        }
        return arr_result;

    }
}
