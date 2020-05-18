package java_advandceObjOriented.Resizeable;

public class Test_interface_resize {
    public static void main(String[] args) {
        Circle circle = new Circle(3.00);
        Rectangle rectangle = new Rectangle(7,5);
        Square square = new Square(7);


        circle.resize(Math.floor(Math.random()*100));
        rectangle.resize(Math.floor(Math.random()*100));
        square.resize(Math.floor(Math.random()*100));
    }
}
