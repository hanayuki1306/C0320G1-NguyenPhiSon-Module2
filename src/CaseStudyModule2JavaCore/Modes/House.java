package CaseStudyModule2JavaCore.Modes;


public class House extends Services {

    TypeHouse typeHousee;
    public House() {
    }

    private String convenientDescription;
    private int numberOfFloors;


    String address_house;

    //Type house GOOD va NORMAL  then adress, arenause

    public House(String id, String nameService, double arenaUse, double rentalCosts, int maxPeople, String typeRent, TypeHouse typeHousee, String convenientDescription, int numberOfFloors, String address_house) {

        super(id, nameService, arenaUse, rentalCosts, maxPeople, typeRent);
        this.typeHousee = typeHousee;
        this.convenientDescription = convenientDescription;
        this.numberOfFloors = numberOfFloors;
        this.address_house = address_house;
    }

    public String getTypeHousee() {
        if ( typeHousee == TypeHouse.GOOD){
            return "GOOD";
        } else return "NORMAL";
    }

    public void setTypeHousee(String typeHousee) {
        if (typeHousee == "GOOD"){
            this.typeHousee = TypeHouse.GOOD;
        } else if (typeHousee == "NORMAL"){
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
                "typeHouse= " + typeHousee +
                ", ConvenientDescription='" + convenientDescription + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", address_house='" + address_house + '\'' +
                '}';
    }
}
