package java_Inheritance.test.thuc_hanh;

public class Circle extends Geometric {
//    super();
    double radius;
    public Circle(){};
    public Circle(double radius){
        this.radius = radius;
    };
    public Circle(double radius, String color, String filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double get_Area(){
        return radius*radius*Math.PI;
    };
    public double getDiameter() {
        return 2 * radius;
    }
    public void printCircle() {
        System.out.println("The " + getColor() + " circle is created with the radius is " + radius);
    }

    public static void main(String[] args) {
//        Geometric circle2 = new Circle();
        Circle circle1 = new Circle(2,"red","green");
        circle1.toString();
        circle1.printCircle();
        System.out.println(circle1.get_Area());
        System.out.println("This is circle1 after set another coler and radius");

        circle1.setRadius(5);
        circle1.setColor("White");


        circle1.toString();
        circle1.printCircle();
        System.out.println(circle1.get_Area());



    }
}
