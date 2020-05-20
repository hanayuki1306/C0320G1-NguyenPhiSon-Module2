package CaseStudyModule2JavaCore.Modes;

import todo_CaseStudy.Services.Services;
import todo_CaseStudy.Services.TypeHouse;

public class House extends Services {

//    int Low = 1;
//    int Normal = 2;
//    int Good = 3;
    TypeHouse typeHousee;
    public House() {
    }



    String address_house;

    //Type house GOOD va NORMAL  then adress, arenause
    public House(TypeHouse typeHouse, String address_house, double arena_use) {
        super.setArena_use(arena_use);
        this.address_house = address_house;
        typeHousee = typeHouse;
    }

    @Override
    public void showInfo() {
        System.out.println("aaaaaaaaaa");
        System.out.println("Name or Services "+ this.getNameServices());
        System.out.println("Arena_use "+ this.getArena_use());
//        System.out.println("TypeUse " + this.getTypeUse());
        System.out.println("Type House " + typeHousee);
        System.out.println("Adress house" + address_house);

    }



    public static void main(String[] args) {
        House house = new House();
        house.showInfo();

    }
}
