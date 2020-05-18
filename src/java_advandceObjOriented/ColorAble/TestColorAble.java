package java_advandceObjOriented.ColorAble;
import java_advandceObjOriented.Resizeable.Circle;
import java_advandceObjOriented.Resizeable.Rectangle;
import java_advandceObjOriented.Resizeable.Shape;
import java_advandceObjOriented.Resizeable.Square;
public class TestColorAble {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4);
        shapes[1] = new Square();
        shapes[2] = new Square(8);
        shapes[3] = new Rectangle();


        // kieu shape qua interface

//        Square square1 = new Square();
//        square1.howToColor();
//        ((Colorable) shapes[0]).howToColor();

        for(Shape element: shapes){
            if (element instanceof Colorable){
                System.out.println(element);
                ((Colorable) element).howToColor();
                System.out.println("Break line -- ");
            }
        }
    }
}
