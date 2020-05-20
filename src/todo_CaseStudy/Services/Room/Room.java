package todo_CaseStudy.Services.Room;

import todo_CaseStudy.Services.Services;

public class Room extends Services {
    public Room(){

    };

    String AddressTower;
    int NumberOfRoom;

    public Room(String AddressTower, int number_Room, double Arena_use) {
        this.AddressTower = AddressTower;
        this.NumberOfRoom = number_Room;
        super.setArena_use(Arena_use);
    }

    @Override
    public void showInfo() {
        System.out.println("--------------------------------");
        System.out.println("Name or Services "+ this.getNameServices());
        System.out.println("Arena_use "+ this.getArena_use());
        System.out.println("Address_Tower" + AddressTower);
        System.out.println("Number_room" + NumberOfRoom);
    }
}
