package CaseStudyModule2JavaCore.Controller;


import CaseStudyModule2JavaCore.Modes.House;
import CaseStudyModule2JavaCore.Modes.Room;
import CaseStudyModule2JavaCore.Modes.Villa;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu(){

        System.out.println("This is client of Farama Resort, pls choice contact with this client by input number");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employee");
        System.out.println("7. Exit");
        System.out.println("Enter the next choice");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                addNewServices();
                displayMainMenu();
                break;
            case 2:
                break;
            case 7:
                System.exit(0);
            default:
                System.out.println("input wrong, pls input again");
                displayMainMenu();
        }


    }

    public static void addNewServices(){
        System.out.println("Pls input ur service you want add:");
        System.out.println("----------------------------------");

        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");

        System.out.println("5. RemoveCache Villa csv File");
        System.out.println("6. RemoveCache House csv File");
        System.out.println("7. RemoveCache Room csv File");
        System.out.println("8. Exit");

        System.out.print("Input your choice: ");


        int input = Integer.parseInt(scanner.nextLine());

        switch (input){
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                removeCacheVilla();
                break;
            case 6:
                removeCacheHouse();
                break;
            case 7:
                removeCacheRoom();
                break;
            case 8:
                System.exit(0);

            default:
                System.out.println("Fail!, PLS enter again ...");
                scanner.nextLine();
                addNewServices();
        }
    };

    private static void addNewVilla(){
        ArrayList<Villa> ListVilla = new ArrayList<Villa>();
        System.out.println("Enter number of villa  element you want input");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i=0; i<length;i ++){
            Villa villa = new Villa();
            System.out.println("Enter areaPool  double");
            villa.setAreaPool(Double.parseDouble(scanner.nextLine()));
            System.out.println("Enter room Standard  String");
            villa.setRoomStandard(scanner.nextLine());
            System.out.println("Enter convenientDescription String ");
            villa.setConvenientDescription(scanner.nextLine());
            System.out.println("Enter number of Floors  int");
            villa.setNumberOfFloors(Integer.parseInt(scanner.nextLine()));
            ListVilla.add(villa);
        }
        Add_new_services.WriteVillaToCSV(ListVilla);
    }
    private static void removeCacheVilla(){
        Add_new_services.removeCacheVilla();
    }
    private  static void removeCacheHouse(){
        Add_new_services.removeCacheHouse();
    }
    private static void removeCacheRoom(){
        Add_new_services.removeCacheRoom();
    }

    private static void addNewHouse(){
        ArrayList<House> ListHouse = new ArrayList<House>();
        System.out.println("Enter number of House  element you want input");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i=0; i<length;i ++){
            House house = new House();
            System.out.println("Enter type House   GOOD or NORMAL only ");
            house.setTypeHousee(scanner.nextLine());
            System.out.println("Enter convenientDescription String ");
            house.setConvenientDescription(scanner.nextLine());
            System.out.println("Enter number of Floors  int");
            house.setNumberOfFloors(Integer.parseInt(scanner.nextLine()));
            ListHouse.add(house);
        }
        Add_new_services.WriteHouseToCSV(ListHouse);

    }
    private static void addNewRoom(){
        ArrayList<Room> ListRoom = new ArrayList<Room>();
        System.out.println("Enter number of Room  element you want input");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i=0; i<length;i ++){
            Room room = new Room();
            System.out.println("Enter number of Room you can use  type int");
            room.setNumberOfRoom(Integer.parseInt(scanner.nextLine()));
            System.out.println("Enter arena use  type Double");
            room.setArena_use(Double.parseDouble(scanner.nextLine()));
            ListRoom.add(room);
        }
        Add_new_services.WriteRoomToCSV(ListRoom);
    }




    public static void main(String[] args) {
        displayMainMenu();
    }
}
