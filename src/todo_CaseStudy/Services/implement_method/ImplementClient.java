package todo_CaseStudy.Services.implement_method;

import todo_CaseStudy.Services.*;
import todo_CaseStudy.Services.Display.Display_client;
import todo_CaseStudy.Services.House.House;
import todo_CaseStudy.Services.Villa.Villa;

public class ImplementClient {
    public static  int a = 3;
    public static void main(String[] args) {
//        Display_client();
    }


    public void Display_client(){
//        Services house1 = new House(TypeHouse.MEDIUM,"Khu A", 1);
//        house1.showInfo();
        Services Villa = new Villa(TypeVilla.GOOD,"nguyen Van linh",5 );
        Villa.showInfo();
    };


}
