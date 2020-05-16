package Java_Class_and_Object.Bai_Tap.TrienKhaiTriangle;

import Java_Class_and_Object.Thuc_hanh.Relactangle.Shape;

public class Triangle extends Shape {
    double slide1;
    double slide2;
    double slide3;

//    double Perimete;


    public Triangle(){

    }

    public Triangle(double slide1, double slide2, double slide3) {
        this.slide1 = slide1;
        this.slide2 = slide2;
        this.slide3 = slide3;
    }

    public double getSlide1() {
        return slide1;
    }

    public double getSlide2() {
        return slide2;
    }

    public double getSlide3() {
        return slide3;
    }

    public void getAllSlideValue(){

        double[] allSlide = {slide1,slide2,slide3};

        for (int val=0;val<allSlide.length; val++){
            System.out.println("Slide " +(val+1) + " hasvalue " + allSlide[val]);
        }
    }
    public double getPerimeter(){
        return slide1+slide2+slide3;
    }
    public double getArena(){
        double p = this.getPerimeter()/2;
        double S;
        S = Math.sqrt(p*(p-slide1)*(p-slide2)*(p-slide3));
        return S;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Arena=" + getArena() +
                ", Perimeter=" + getPerimeter() +
                ", color=" + getColor() +
                ", isFilled=" + isFilled() +
                '}';
    }

    public static void main(String[] args) {
        Triangle obj = new Triangle(3,4,5);
        obj.setColor("redddddd");
        obj.getAllSlideValue();
        System.out.println(obj.toString());;


    }
}
