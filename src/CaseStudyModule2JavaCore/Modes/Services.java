package CaseStudyModule2JavaCore.Modes;

public abstract class Services {
    private String id;
    private String nameServices;
    double arena_use;
    double costOfUse;
    short max_people;
    double typeUse;
    // type use include (year, month, day, hour)


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getArena_use() {
        return arena_use;
    }

    public void setArena_use(double arena_use) {
        this.arena_use = arena_use;
    }

    public double getCostOfUse() {
        return costOfUse;
    }

    public void setCostOfUse(double costOfUse) {
        this.costOfUse = costOfUse;
    }

    public short getMax_people() {
        return max_people;
    }

    public void setMax_people(short max_people) {
        this.max_people = max_people;
    }

    public double getTypeUse() {
        return typeUse;
    }

    public void setTypeUse(double typeUse) {
        this.typeUse = typeUse;
    }



    public abstract void showInfo();



}
