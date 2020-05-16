package Java_Class_and_Object.Bai_Tap;

import org.w3c.dom.ls.LSOutput;

public class Circle {
    String color;
    double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }
    public Circle(){

    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArena(){
        return radius*radius*Math.PI;
    }
    public String toString(){
//        return System.out.printf("This is Cirle obj has Radius = %f\t Color %s and Arena is: %f",radius,color,getArena());
        return "This is Cirle obj has Radius " + radius +"\nColor " +color + "and Arena is: " + getArena();
    }


    public static void main(String[] args) {
        Circle c1 = new Circle("green", 15);
        System.out.println(c1.toString());
    }
}
