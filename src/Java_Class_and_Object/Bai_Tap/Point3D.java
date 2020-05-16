package Java_Class_and_Object.Bai_Tap;

public class Point3D extends Point2D {
    float z;
    float[] arr = {x,y,z};

    public Point3D(){
    }
    public Point3D(float x,float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x, y);
        this.z =z;
    }
    public float[] getXYZ(){
        return arr;
    }
    public String toString(){
        return  "(" + x + "\t" + y + "\t\t" + z + ")";
    }

    public static void main(String[] args) {
        Point3D obj3d = new Point3D(3,4,5);
        System.out.println(obj3d.toString());;
        Point2D obj2d = new Point2D(2,3);
        System.out.println(obj2d.toString());;

    }
}
