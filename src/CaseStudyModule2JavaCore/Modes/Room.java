package CaseStudyModule2JavaCore.Modes;

import CaseStudyModule2JavaCore.Modes.Services;

import java.util.Objects;

public class Room extends Services implements Comparable<Room>{
    public Room(){
    };


    int numberOfRoom;


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
                "Id" + getId() +
                ", numberOfRoom=" + numberOfRoom +
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
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return numberOfRoom == room.numberOfRoom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfRoom);
    }

    @Override
    public int compareTo(Room room) {
        return this.getNameServices().compareTo(room.getNameServices());
    }
}
