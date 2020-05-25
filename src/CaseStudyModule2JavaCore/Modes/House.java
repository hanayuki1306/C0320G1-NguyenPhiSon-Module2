package CaseStudyModule2JavaCore.Modes;


import java.util.Objects;

public class House extends Services implements Comparable<House>{

    TypeHouse typeHousee;
    public House() {
    }

    private String convenientDescription;
    private int numberOfFloors;


    String address_house;



    public House(String id, String nameService, double arenaUse, double rentalCosts, int maxPeople, String typeRent, TypeHouse typeHousee, String convenientDescription, int numberOfFloors, String address_house) {

        super(id, nameService, arenaUse, rentalCosts, maxPeople, typeRent);
        this.typeHousee = typeHousee;
        this.convenientDescription = convenientDescription;
        this.numberOfFloors = numberOfFloors;
        this.address_house = address_house;
    }

    public String getTypeHousee() {
        if ( typeHousee.equals(typeHousee.GOOD)){
            return "GOOD";
        } else return "NORMAL";
    }

    public void setTypeHousee(String typeHousee) {
        if (typeHousee.equals("GOOD")){
            this.typeHousee = TypeHouse.GOOD;
        } else {
            this.typeHousee = TypeHouse.NORMAL;
        }
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getAddress_house() {
        return address_house;
    }

    public void setAddress_house(String address_house) {
        this.address_house = address_house;
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

    @Override
    public String toString() {
        return "House{" +
                "typeHouse=" + typeHousee +
                ", convenientDescription='" + convenientDescription + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", address_house='" + address_house + '\'' +
                ", arenaUse=" + arenaUse +
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
        if (!(o instanceof House)) return false;
        House house = (House) o;
        return numberOfFloors == house.numberOfFloors &&
                typeHousee == house.typeHousee &&
                convenientDescription.equals(house.convenientDescription) &&
                address_house.equals(house.address_house);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeHousee, convenientDescription, numberOfFloors, address_house);
    }

    @Override
    public int compareTo(House house) {
        return this.getNameServices().compareTo(house.getNameServices());
    }
}
