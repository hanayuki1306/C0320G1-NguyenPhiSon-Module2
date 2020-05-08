package Java_language.Thuc_hanh.Debug;

public class Debug {

    public static void abc() {
        System.out.println("abc");
    }
    public static void bcd() {
        abc();
    }
    public static void main(String[] args) {
        abc();
        int a = 2;
        int b = 6;
        double c = 3.0;
        float d = a+b;
        System.out.println("gia tri cua d: " + d);
    }
}
