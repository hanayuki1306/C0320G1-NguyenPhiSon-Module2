package Java_language.Bai_tap.HienThiSoNguyenTo;

public class PhanTuDauTien_20 {
    public static void main(String[] args) {
        int count = 0;
        while (count<20) {
            int i = 0;
            for (i=0;count<20;i++){
                if (IsPrime(i)){
                    System.out.println(i);
                    count++;
                };
//                System.out.println("count" + count);
            }
        };
    }


    public static boolean IsPrime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
//                return true;
                break;
            }
        }
        if (!flag)
//            System.out.println(num + " is a prime number.");
            return true;
        else
//            System.out.println(num + " is not a prime number.");
            return false;
    }
}
