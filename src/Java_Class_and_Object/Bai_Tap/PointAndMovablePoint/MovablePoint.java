package Java_Class_and_Object.Bai_Tap.PointAndMovablePoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    float xSpeed;
    float ySpeed;
    float[] speedxy ={xSpeed,ySpeed};


    public MovablePoint(){};
    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return speedxy;
    }

    public void move() {
        x += xSpeed;
        y += ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x +" , " + y +"), speed = ("+ xSpeed + " , " + ySpeed + ")";
    }

    public static void main(String[] args) {
        MovablePoint objtest = new MovablePoint(2,3,5,6);
        System.out.println(objtest.toString());
        objtest.move();
        System.out.println(objtest.toString());
        objtest.move();
        System.out.println(objtest.toString());


    }
}
