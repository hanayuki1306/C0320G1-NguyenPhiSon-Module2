package Java_language.Bai_tap.ChuyenDoiTienTe;

public class test {
    static int size = 6;

    public static void main(String[] args) {
        System.out.println("size: " + size  );
        test doituong1 = new test();
        doituong1.size = 7;
        int b = size;

        System.out.println("res" +b);
    }
}
