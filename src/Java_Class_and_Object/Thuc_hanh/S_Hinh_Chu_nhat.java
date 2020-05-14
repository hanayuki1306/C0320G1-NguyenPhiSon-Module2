package Java_Class_and_Object.Thuc_hanh;

public class S_Hinh_Chu_nhat {
    double dai,rong;

    public S_Hinh_Chu_nhat() {};
    public S_Hinh_Chu_nhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    };

    public void setDai(double dai) {
        this.dai = dai;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
    public double Dientich(){
        return this.dai*this.rong;
    }
    public void hienthi(){
        System.out.println("dai" + dai + "rong" + rong);
    }

    public static void main(String[] args) {
        System.out.println("S hinh chu nhat");
        S_Hinh_Chu_nhat hinh1 = new S_Hinh_Chu_nhat(13,23);

        hinh1.hienthi();
        double a1 = hinh1.Dientich();
        System.out.println(a1);
    }
}
