package Java_Class_and_Object.Bai_Tap.Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int Speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return Speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if(isOn()){
            System.out.println("Speed of Fan is: " + getSpeed() +"\nFan has color " + getColor() +"\nRadius of Fan : " + getRadius());
        } else {
            System.out.println("Fan is off");
            System.out.println("Fan has color " + getColor() +"\nRadius of Fan : " + getRadius());
        }
        return null;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setColor("red");
        fan1.toString();
        System.out.println("________");
        fan1.setSpeed(3);
        fan1.setOn(true);
        fan1.toString();
        System.out.println("________");
        Fan fan2 = new Fan();
        fan2.setOn(true);
        fan2.setSpeed(3);
        fan2.setColor("White");
        fan2.setRadius(13);
    }
}
