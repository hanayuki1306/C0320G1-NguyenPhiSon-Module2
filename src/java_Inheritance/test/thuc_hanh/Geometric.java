package java_Inheritance.test.thuc_hanh;

public class Geometric {
    private String color;
    private String filled;
    public Geometric(){};

    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public String getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    public String toString() {
        return "created with \"" + color + "\" color and " +
                (filled == null ? "no fill" : "filled with \"" + filled + "\" color");
    }

    public static void main(String[] args) {
        Geometric g1 = new Geometric("red","green");
        System.out.println(g1.toString());
    }
}
