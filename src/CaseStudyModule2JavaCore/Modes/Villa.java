package CaseStudyModule2JavaCore.Modes;

import java.util.Objects;

public class Villa extends Services implements Comparable<Villa>{
    private String roomStandard;
    private String convenientDescription;
    private double areaPool;
    private int numberOfFloors;

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
                "ID " + getId()+ '\'' +
                ", TypeVilla=" + TypeVilla +
                ", arenaUse=" + arenaUse +
                "roomStandard='" + roomStandard + '\'' +
                ", convenientDescription='" + convenientDescription + '\'' +
                ", areaPool=" + areaPool +
                ", numberOfFloors=" + numberOfFloors +
                ", costOfUse=" + costOfUse +
                ", maxPeople=" + maxPeople +
                ", typeUse=" + typeUse +
                ", rentalCosts=" + rentalCosts +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Villa)) return false;
        Villa villa = (Villa) o;
        return Double.compare(villa.areaPool, areaPool) == 0 &&
                numberOfFloors == villa.numberOfFloors &&
                roomStandard.equals(villa.roomStandard) &&
                convenientDescription.equals(villa.convenientDescription) &&
                TypeVilla == villa.TypeVilla;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomStandard, convenientDescription, areaPool, numberOfFloors, TypeVilla);
    }

    @Override
    public int compareTo(Villa o) {
        return this.getNameServices().compareTo(o.getNameServices());
    }
}
