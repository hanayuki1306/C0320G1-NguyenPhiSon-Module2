package CaseStudyModule2JavaCore.Modes;

public abstract class Services {
    private String id;
    private String nameServices;
    double arenaUse;
    double costOfUse;
    int maxPeople;
    double typeUse;
    double rentalCosts;
    String typeRent;
    // type use include (year, month, day, hour)

    public Services(){

    };

    public Services(String id, String nameService, double arenaUse, double rentalCosts, int maxPeople, String typeRent) {
        this.id = id;
        this.nameServices = nameService;
        this.arenaUse = arenaUse;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.typeRent = typeRent;
    }
    

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
        return arenaUse;
    }

    public void setArena_use(double arena_use) {
        this.arenaUse = arena_use;
    }

    public double getCostOfUse() {
        return costOfUse;
    }

    public void setCostOfUse(double costOfUse) {
        this.costOfUse = costOfUse;
    }

    public int getMax_people() {
        return maxPeople;
    }

    public void setMax_people(short max_people) {
        this.maxPeople = max_people;
    }

    public double getTypeUse() {
        return typeUse;
    }

    public void setTypeUse(double typeUse) {
        this.typeUse = typeUse;
    }



    public abstract void showInfo();



}
