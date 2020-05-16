package java_Inheritance.test;

import javax.xml.namespace.QName;

public class Apple extends Fruit {
//
//    public Apple(String name) {
//        super(name);
//        System.out.println(name);
//    super(name);
//    int a;
    public Apple(int a){
        super("hahhaha");
        System.out.println(a);
    };
    public static void main(String[] args) {
        new Apple(1);
    }

}


class Fruit {
    public Fruit(String name) {
        System.out.println("Fruit's constructor invoked");
        }

    public Fruit() {

    }
}
