package CaseStudyModule2JavaCore.Controller;
import CaseStudyModule2JavaCore.Modes.*;
import java_advandceObjOriented.ColorAble.Colorable;


import java.io.*;
import java.util.*;
public class Add_new_services<T> {
    public static Scanner scanner = new Scanner(System.in);
    private static final String filenameVilla = "src/CaseStudyModule2JavaCore/Data/Villa.csv";
    private static final String filenameHouse = "src/CaseStudyModule2JavaCore/Data/House.csv";
    private static final String filenameRoom = "src/CaseStudyModule2JavaCore/Data/Room.csv";
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String HEADER = "String id, String nameService, double arenaUse, double rentalCosts, int maxPeople, String typeRent, String roomStandard, String convenientDescription, double areaPool, int numberOfFloors, CaseStudyModule2JavaCore.Modes.TypeVilla typeVilla\n";
//
//    private static String root_links;
//    public static String checkinput(int number){
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
//                System.out.println("Don`t know root link of file csv ");
//        }
//        return root_links;
//    }


    public static void WriteVillaToCSV(ArrayList<Villa>  ListVilla){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filenameVilla,true);
            //fileWriter.append(HEADER);
//            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa: ListVilla){
                fileWriter.append(villa.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getNameServices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getArena_use()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getMaxPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getConvenientDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAreaPool()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getNumberOfFloors()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getTypeVilla());



                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("Add villa Completed\n");
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


    public static void WriteHouseToCSV(ArrayList<House>  ListHouse){
//        new FileWriter("src/CaseStudyModule2JavaCore/Data/Villa.csv", true);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filenameHouse,true);
//            fileWriter.append(HEADER);
            //fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house: ListHouse){
                fileWriter.append(house.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getNameServices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getArena_use()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getMaxPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getTypeHousee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getConvenientDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getNumberOfFloors()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getAddress_house());
//                fileWriter.append(COMMA_DELIMITER);

                fileWriter.append(NEW_LINE_SEPARATOR);

            }

            System.out.println("Add house completed\n");
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
//            fileWriter.append(HEADER);
//            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room room: ListRoom){
                fileWriter.append(room.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getNameServices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getArena_use()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getMaxPeople()));
                fileWriter.append((COMMA_DELIMITER));
                fileWriter.append(room.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getNumberOfRoom()));




                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("Add room Completed\n");
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
    public static void removeCacheVilla(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filenameVilla);
            fileWriter.append(HEADER);
            System.out.println("Remove villa Completed\n");
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
            fileWriter.append(HEADER);
            System.out.println("Remove House Completed\n");
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
            fileWriter.append(HEADER);
            System.out.println("Remove Room Completed\n");
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


    public ArrayList<Villa> getFileCsvVillaToList(){
        BufferedReader br = null;
        ArrayList<Villa> VillaList = new ArrayList<Villa>();
        try {
            String line;
            br = new BufferedReader(new FileReader(filenameVilla));

            while ((line = br.readLine()) != null){
                String[] splitData = line.split(",");
                if (splitData[0].equals("String id")){
                    continue;
                }
                Villa villa = new Villa();
                villa.setId(splitData[0]);
                villa.setNameServices(splitData[1]);
                villa.setArenaUse(Double.parseDouble(splitData[2]));
                villa.setRentalCosts(Double.parseDouble(splitData[3]));
                villa.setMaxPeople(Integer.parseInt(splitData[4]));
                villa.setTypeRent(splitData[5]);
                villa.setRoomStandard(splitData[6]);
                villa.setConvenientDescription(splitData[7]);
                villa.setAreaPool(Double.parseDouble(splitData[8]));
                villa.setNumberOfFloors(Integer.parseInt(splitData[9]));
                villa.setTypeVilla(splitData[10]);

                VillaList.add(villa);
            }
            System.out.println("done Villa ....\n");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return VillaList;
    }



    ArrayList<Villa> ListVillaCsv  = getFileCsvVillaToList();


    public void showInfoServiceVilla() {

         for (Villa villa: ListVillaCsv){
             System.out.println("---------------------------\n");
             System.out.println("String id = " + villa.getId() +
                                ", NameService" + villa.getNameServices() +
                                ", areaUse "+ villa.getArena_use()+
                                ", RentalCosts " + villa.getRentalCosts()+
                                ", Max people " + villa.getMaxPeople() +
                                ", Type rent " + villa.getTypeRent() +
                                ", RoomStandard " + villa.getRoomStandard()+
                                ", ConvenientDescription " + villa.getConvenientDescription()+
                                ", AreaPool " + villa.getAreaPool() +
                                ", Number Of Floor " + villa.getNumberOfFloors() +
                                ", Type Villa " + villa.getTypeVilla());
             System.out.println("----------------------");
        }
    }

    public ArrayList<House> getFileCsvHouseToList(){
            BufferedReader br = null;
            ArrayList<House> HouseList = new ArrayList<>();
            try {
                String line;
                br = new BufferedReader(new FileReader(filenameHouse));

                while ((line = br.readLine()) != null){
                    String[] splitData = line.split(",");
                    if (splitData[0].equals("String id")){
                        continue;
                    }
                    House house = new House();
                    house.setId(splitData[0]);
                    house.setNameServices(splitData[1]);
                    house.setArenaUse(Double.parseDouble(splitData[2]));
                    house.setRentalCosts(Double.parseDouble(splitData[3]));
                    house.setMaxPeople(Integer.parseInt(splitData[4]));
                    house.setTypeRent(splitData[5]);
                    house.setTypeHousee(splitData[6]);
                    house.setConvenientDescription(splitData[7]);
                    house.setNumberOfFloors(Integer.parseInt(splitData[8]));
                    house.setAddress_house(splitData[9]);

                    HouseList.add(house);
                }
                System.out.println("done House ...\n ");


            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    br.close();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            return HouseList;
        }

    public void showInfoServiceHouse() {
        ArrayList<House>  ListHouse = getFileCsvHouseToList();
        for (House house: ListHouse){
            System.out.println("---------------------------\n");
            System.out.println("String id = " + house.getId() +
                    ", NameService" + house.getNameServices() +
                    ", areaUse "+ house.getArena_use()+
                    ", RentalCosts " + house.getRentalCosts()+
                    ", Max people " + house.getMaxPeople() +
                    ", Type rent " + house.getTypeRent() +
                    ", Type House" + house.getTypeHousee() +
                    ", ConvenientDescription " + house.getConvenientDescription()+
                    ", Number Of Floor " + house.getNumberOfFloors() +
                    ", Address House " + house.getAddress_house());
            System.out.println("----------------------");
        }
    }

    ArrayList<Room> ListRoom  = getFileCsvRoomToList();
    public ArrayList<Room> getFileCsvRoomToList(){
        BufferedReader br = null;
        ArrayList<Room> RoomList = new ArrayList<Room>();
        try {
            String line;
            br = new BufferedReader(new FileReader(filenameRoom));

            while ((line = br.readLine()) != null){
                String[] splitData = line.split(",");
                if (splitData[0].equals("String id")){
                    continue;
                }
                Room room = new Room();
                room.setId(splitData[0]);
                room.setNameServices(splitData[1]);
                room.setArenaUse(Double.parseDouble(splitData[2]));
                room.setRentalCosts(Double.parseDouble(splitData[3]));
                room.setMaxPeople(Integer.parseInt(splitData[4]));
                room.setTypeRent(splitData[5]);
                room.setNumberOfRoom(Integer.parseInt(splitData[6]));

                RoomList.add(room);
            }
            System.out.println("done Room ... ");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return RoomList;
    }
    public void showInfoServiceRoom() {

        for (Room room: ListRoom){
            System.out.println("---------------------------\n");
            System.out.println("String id = " + room.getId() +
                    ", NameService" + room.getNameServices() +
                    ", areaUse "+ room.getArena_use()+
                    ", RentalCosts " + room.getRentalCosts()+
                    ", Max people " + room.getMaxPeople() +
                    ", Type rent " + room.getTypeRent() +
                    ", NumberOfRoom " + room.getNumberOfRoom());
            System.out.println("----------------------");
        }
    }

}

