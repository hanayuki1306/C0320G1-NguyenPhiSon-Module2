package Java_Class_and_Object.Bai_Tap;

public class Cylinder extends Circle {
    double high;
    public Cylinder(){
        super();
    }
    public Cylinder(String Color,double Radius,double high){
            super(Color,Radius);
            this.high = high;
    }
//2πr(h+r)
    @Override
    public double getArena(){
        return 2*Math.PI*(high + radius);
    }
    public String toString(){
        return "This is Cylinder obj has Radius " + radius +"\nColor " +color + "and Arena is: " + getArena() + "\ntks";
    }

    public static void main(String[] args) {
        Cylinder obj1 = new Cylinder("red",15,13);
        System.out.println(obj1.toString());
    }
}
