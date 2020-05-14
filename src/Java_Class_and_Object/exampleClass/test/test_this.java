package Java_Class_and_Object.exampleClass.test;

import javax.xml.namespace.QName;

public class test_this {
    public static void main(String[] args) {
        Test tv1 = new Test();
        String a = tv1.getName();
        System.out.println(a);
    }
    static class Test {
        String name = "son";
        String email;
        int age;
         public String getName(){
            return "idiot";
        }
    }

}
//public class test{
//    int age;
//    public  int print_name(int age){
//        this.age = age;
//        return age;
//    }
//
//}