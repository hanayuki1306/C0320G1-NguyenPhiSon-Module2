package CaseStudyModule2JavaCore.Modes;

import CaseStudyModule2JavaCore.Modes.Services;

public class Room extends Services {
    public Room(){
    };

//    String AddressTower;
    int numberOfRoom;

//    public Room(int number_Room, double Arena_use) {
////        this.AddressTower = AddressTower;
//        this.numberOfRoom = number_Room;
//        super.setArena_use(Arena_use);
//    }


    public Room(String id, String nameService, double arenaUse, double rentalCosts, int maxPeople, String typeRent, int numberOfRoom){
        super(id, nameService, arenaUse, rentalCosts, maxPeople, typeRent);
        this.numberOfRoom = numberOfRoom;

    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    @Override
    public void showInfo() {
        System.out.println("--------------------------------");
        System.out.println("Name or Services "+ this.getNameServices());
        System.out.println("Arena_use "+ this.getArena_use());
        System.out.println("Number_room" + numberOfRoom);
    }

    @Override
    public String toString() {
        return "Room{" +
                "arenaUse=" + arenaUse +
                ", costOfUse=" + costOfUse +
                ", maxPeople=" + maxPeople +
                ", typeUse=" + typeUse +
                ", rentalCosts=" + rentalCosts +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
}
