package CaseStudyModule2JavaCore.Modes;

import org.w3c.dom.ls.LSOutput;

public class Villa extends Services {
    private String roomStandard;
    private String convenientDescription;
    private double areaPool;
    private int numberOfFloors;
//    String Address_Villa;
    TypeVilla TypeVilla;


    public Villa(){

    }

    public Villa(String id, String nameService, double arenaUse, double rentalCosts, int maxPeople, String typeRent, String roomStandard, String convenientDescription, double areaPool, int numberOfFloors, TypeVilla typeVilla) {
        super(id, nameService, arenaUse, rentalCosts, maxPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
        TypeVilla = typeVilla;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getTypeVilla() {
        if (TypeVilla.equals(TypeVilla.GOOD)){
            return "GOOD";
        } else return "NORMAL";
    }

    public void setTypeVilla(String typeVilla) {
        if (typeVilla.equals("GOOD")){
            this.TypeVilla = TypeVilla.GOOD;
        } else {
            this.TypeVilla = TypeVilla.NORMAl;
        }
    }

    @Override
    public void showInfo() {
        System.out.println("--------------------------------");
        System.out.println("Name or Services "+ this.getNameServices());
        System.out.println("Arena_use "+ this.getArena_use());
        System.out.println("Type Villa " + TypeVilla);

    }

    @Override
    public String toString() {
        return "Villa{" +
                "areaPool " + areaPool +
                ", roomStandard = '" + roomStandard + '\'' +
                ", convenientDescription='" + convenientDescription + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", TypeVilla=" + TypeVilla +
                '}';
    }
}
