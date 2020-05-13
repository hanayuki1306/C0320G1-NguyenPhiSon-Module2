package Java_Arrays.Bai_Tap;

import com.sun.jdi.CharType;

import java.util.Scanner;

public class Dem_so_lan_xuat_hien_ky_tu_trong_chuoi {
    public static void main(String[] args) {
        String string_input;
        Scanner scanner = new Scanner(System.in);
        char char_input;

        System.out.println("input String:");
        string_input = scanner.nextLine();
        System.out.println("input char need to count");
        char_input = scanner.nextLine().charAt(0);
        int res = count_element(string_input,char_input);

        if (res!=0){
            System.out.println("Char input " + char_input + " Xuat hien " +res + " lan");
        } else {
            System.out.println("Have no Char\t" + char_input + "\t in Sring");
        }


    }

//    Hàm str.length() trả về tổng số ký tự trong một chuỗi str
//
//    Hàm str.charAt(i) trả về ký tự ở vị trí thứ i trong chuỗi str
    public static int count_element(String str,char char_element){
        int count = 0;
        for (int i = 0;i< str.length(); i++){
            if (str.charAt(i) == char_element){
                count++;
            }
        }
        return count;
    }
}
