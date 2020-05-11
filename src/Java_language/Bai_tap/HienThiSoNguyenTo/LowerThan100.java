package Java_language.Bai_tap.HienThiSoNguyenTo;

public class LowerThan100 {
    public static void main(String[] args) {
        int i;
        for(i=0;i<100;i++){
            if (IsPrime(i)){
                System.out.println(i);
            };
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