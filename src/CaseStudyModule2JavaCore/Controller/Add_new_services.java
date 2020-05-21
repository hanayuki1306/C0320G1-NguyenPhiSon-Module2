package CaseStudyModule2JavaCore.Controller;
import CaseStudyModule2JavaCore.Modes.House;
import CaseStudyModule2JavaCore.Modes.Room;
import CaseStudyModule2JavaCore.Modes.TypeVilla;
import CaseStudyModule2JavaCore.Modes.Villa;


import java.io.*;
import java.util.*;
public class Add_new_services {
    public static Scanner scanner = new Scanner(System.in);
    private static final String filenameVilla = "src/CaseStudyModule2JavaCore/Data/Villa.csv";
    private static final String filenameHouse = "src/CaseStudyModule2JavaCore/Data/House.csv";
    private static final String filenameRoom = "src/CaseStudyModule2JavaCore/Data/Room.csv";
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n\n";
    private static final String HEADER = " HEADER";

//    private String root_links;
//    public String checkinput(int number){
//        switch (number){
//            case 1:
//                root_links = filenameVilla;
//                break;
//            case 2:
//                root_links = filenameHouse;
//                break;
//            case 3:
//                root_links = filenameRoom;
//                break;
//            default:
//                System.out.println("dont know root link of file csv ");
//        }
//        return root_links;
//    }


    public static void WriteVillaToCSV(ArrayList<Villa>  ListVilla){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filenameVilla,true);
            fileWriter.append(HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa: ListVilla){
                fileWriter.append(villa.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("Add villa compelete\n");
        } catch (Exception ex){
            System.out.println("Error, in FileWriter, file not found!!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex){
                System.out.println("ERROR when flush or close,villa");
            }
        }
    }
    public static void removeCacheVilla(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filenameVilla);
            System.out.println("Remove villa compelete\n");
        } catch (Exception ex){
            System.out.println("Error, in FileWriter, file not found!!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex){
                System.out.println("ERROR when flush or close,villa");
            }
        }
    }
    public static void removeCacheHouse(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filenameHouse);
            System.out.println("Remove House compelete\n");
        } catch (Exception ex){
            System.out.println("Error, in FileWriter, file not found!!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex){
                System.out.println("ERROR when flush or close,House");
            }
        }
    }
    public static void removeCacheRoom(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filenameRoom);
            System.out.println("Remove Room compelete\n");
        } catch (Exception ex){
            System.out.println("Error, in FileWriter, file not found!!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex){
                System.out.println("ERROR when flush or close,Room");
            }
        }
    }

    public static void WriteHouseToCSV(ArrayList<House>  ListHouse){
//        new FileWriter("src/CaseStudyModule2JavaCore/Data/Villa.csv", true);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filenameHouse,true);
            fileWriter.append(HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house: ListHouse){
                fileWriter.append(house.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("Add house compele0te\n");
        } catch (Exception ex){
            System.out.println("Error, in FileWriter, file not found!!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex){
                System.out.println("ERROR when flush or close, House");
            }
        }
    }

    public static void WriteRoomToCSV(ArrayList<Room>  ListRoom){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filenameRoom,true);
            fileWriter.append(HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room room: ListRoom){
                fileWriter.append(room.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("Add room Compelete\n");
        } catch (Exception ex){
            System.out.println("Error, in FileWriter, file not found!!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex){
                System.out.println("ERROR when flush or close, Room");
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Villa> ListVilla = new ArrayList<Villa>();
        Villa villa1 = new Villa();
        ListVilla.add(villa1);
        Villa villa2 = new Villa("13","haha", 12,12,1,"ds","hsfhs","metmoi",12,12, TypeVilla.GOOD);

        ListVilla.add(villa2);
        WriteVillaToCSV(ListVilla);

    }

}
