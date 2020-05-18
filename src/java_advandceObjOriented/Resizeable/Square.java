package java_advandceObjOriented.Resizeable;

import java_advandceObjOriented.ColorAble.Colorable;

public class Square extends Rectangle implements Resizeable, Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public double getArena(){
//        System.out.println("this is slide of Square" + this.getSide());
        if (this.getSide() == 0.0) {
            return 0;
        } else {
            return this.getSide() * this.getSide();
        }
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", arena is " + getArena()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        double res;
        res = this.getSide() + getSide()*percent/100;
        System.out.println("A Square with slide = " + getSide()+ " before resize");
        System.out.println("After resize, Slide of Square = " + res + " increase " + percent + " percent");

    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four side");
    }
}