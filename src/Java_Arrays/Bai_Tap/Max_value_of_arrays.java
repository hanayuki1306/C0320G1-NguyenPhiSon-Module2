package Java_Arrays.Bai_Tap;

public class Max_value_of_arrays {
    public static void main(String[] args) {
        int arr[][] = new int[10][10];

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = (int) (Math.random() * 100);
            }
        }

        System.out.println("This is arr element");

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }

        int max = arr[0][0];
//        System.out.println("this is arr.length"+ arr.length);
//        System.out.println("this is arr[arr.length-1].length"+ arr[arr.length-1].length);
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++){
                if (arr[row][column]>max) {
                    max = arr[row][column];
                }

            }
        }
        System.out.println("Max value is:" + max);



    }
}
