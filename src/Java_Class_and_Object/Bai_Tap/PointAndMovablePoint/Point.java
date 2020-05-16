package Java_Class_and_Object.Bai_Tap.PointAndMovablePoint;

public class Point {
    float x;
    float y;
    float [] xy = {x,y};


    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public  Point(){

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        return xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point obj1 = new Point(3,4);
        System.out.println(obj1.toString());;
    }
}
