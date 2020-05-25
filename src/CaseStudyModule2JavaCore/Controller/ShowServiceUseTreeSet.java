package CaseStudyModule2JavaCore.Controller;
import CaseStudyModule2JavaCore.Modes.House;
import CaseStudyModule2JavaCore.Modes.Room;
import CaseStudyModule2JavaCore.Modes.Services;
import CaseStudyModule2JavaCore.Modes.Villa;

import java.util.ArrayList;
import java.util.TreeSet;


public class ShowServiceUseTreeSet {
    AddNewServices services = new AddNewServices();

    public TreeSet<Villa> ShowVilla(){
        ArrayList<Villa> ListVilla = services.getFileCsvVillaToList();
        TreeSet<Villa> villas = new TreeSet<>();
        for(Villa element: ListVilla){
            villas.add(element);
        }
        return villas;
    }

    public void ShowInfoVillaUseTreeSet(){
        TreeSet<Villa> TreeVilla = ShowVilla();
        for (Villa element: TreeVilla){
            System.out.println(element);
        }
    }

    public TreeSet<House> ShowHouse(){
        ArrayList<House> ListHouse = services.getFileCsvHouseToList();
        TreeSet<House> house = new TreeSet<>();
        for(House element: ListHouse){
            house.add(element);
        }
        return house;
    }
    public void ShowInfoHouseUseTreeSet(){
        TreeSet<House> TreeHouse = ShowHouse();
        for (House element: TreeHouse){
            System.out.println(element);
        }
    }

    public TreeSet<Room> ShowRoom(){
        ArrayList<Room> ListRoom = services.getFileCsvRoomToList();
        TreeSet<Room> rooms = new TreeSet<>();
        for(Room element: ListRoom){
            rooms.add(element);
        }
        return rooms;
    }
    public void ShowInfoRoomUseTreeSet(){
        TreeSet<Room> TreeRoom = ShowRoom();
        for (Room element: TreeRoom){
            System.out.println(element);
        }
    }


}
