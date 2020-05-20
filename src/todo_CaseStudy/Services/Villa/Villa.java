package todo_CaseStudy.Services.Villa;

import todo_CaseStudy.Services.Services;
import todo_CaseStudy.Services.TypeVilla;

public class Villa extends Services {
    public Villa(){

    }
    String Address_Villa;
    TypeVilla TypeVilla;


    // Type GOOD, NORMAL  then address
    public Villa(TypeVilla typeVilla, String address_Villa, double arena_use) {
        this.setArena_use(arena_use) ;
        this.Address_Villa = address_Villa;
        this.TypeVilla = typeVilla;
    }


    // need to input cost or what
    @Override
    public void showInfo() {
        System.out.println("--------------------------------");
        System.out.println("Name or Services "+ this.getNameServices());
        System.out.println("Arena_use "+ this.getArena_use());
        System.out.println("Type Villa " + TypeVilla);
        System.out.println("Adress Villa " + Address_Villa);
    }


}
