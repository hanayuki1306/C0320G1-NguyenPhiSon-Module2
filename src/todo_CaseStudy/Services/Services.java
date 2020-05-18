package todo_CaseStudy.Services;

public abstract class  Services {
    String id;
    String nameServices;
    double arena_use;
    double costOfUse;
    short max_people;
    double typeUse;
    // tyuse include (year, month, day, hour)
    public void showInfor(){
        System.out.println("Name or Services "+ nameServices);
        System.out.println("Arena_use "+ arena_use);
        System.out.println("CostOfUse " +costOfUse);
        System.out.println("TypeUse " + typeUse);
    }
}
