package Java_Class_and_Object.Bai_Tap;

public class Point2D {
    float x;
    float y;
    float [] arr = {x,y};

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D(){

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return arr;
    }

    public String toString(){
        return "(" + x + "\t" + y + ")";
    }
}
