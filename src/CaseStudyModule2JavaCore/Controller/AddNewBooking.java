package CaseStudyModule2JavaCore.Controller;

import CaseStudyModule2JavaCore.Modes.*;
import CaseStudyModule2JavaCore.View.Main;

import java.io.FileWriter;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class AddNewBooking {
    public static Scanner scanner = new Scanner(System.in);
    private Services Villa;
    AddNewServices services = new AddNewServices();

    public void BookingMenu(){

        System.out.println("This is Booking menu, pls choice service you want");
        System.out.println("1. Show info Villa exist and menu Booking Services");
        System.out.println("2. Show info House exist and menu Booking Services");
        System.out.println("3. Show info Room exist and menu Booking Services");
        System.out.println("4. Back to main menu");

        int input = Integer.parseInt(scanner.nextLine());
        switch (input){
            case 1:
                System.out.println("This is info Villa");
                services.showInfoServiceVilla();
                menuBookingService();

                break;
            case 2:
                System.out.println("This is info House");
                services.showInfoServiceHouse();
                menuBookingService();

                break;
            case 3:
                System.out.println("This is infoRoom");
                services.showInfoServiceRoom();
                menuBookingService();
                break;
            case 4:
                MainController.displayMainMenu();
                break;
            case 5: FakeList();
                break;
            default:
                System.out.println("pls choice 1-4");
                BookingMenu();
        }

    }
    public void ShowInfoCustomerSortByIdCard(){
        AddNewCustomer customer = new AddNewCustomer();
        customer.showInformationCustomers(customer.compareByIdCard());
        BookingMenu();

    }


    private static final String fileBooking = "src/CaseStudyModule2JavaCore/Data/Booking.csv";
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String HEADER = "ID Card Customer, Name Customer, Services, ID Services";



    public void WriteBookingToCSV(ArrayList<Customer> BookingList){

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileBooking, true);
            System.out.println("Add booking ..........");
            for (Customer element: BookingList){
                fileWriter.append(element.getIdCard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getHoVaTen());
                fileWriter.append(COMMA_DELIMITER);


                System.out.println("Enter Service you want booking");
                System.out.println("1. Villa");
                System.out.println("2. House");
                System.out.println("3. Room");
                System.out.println("4. Back");
                int input = Integer.parseInt(scanner.nextLine());
                switch (input){
                    case 1:
                        boolean check = false;
                        fileWriter.append("Villa");
                        fileWriter.append(COMMA_DELIMITER);
                        do {
                            System.out.println("Enter Villa id you want Booking");
                            String inputId = scanner.nextLine();
                            if (bookVilla(inputId) != "NoRes") {
                                fileWriter.append(bookVilla(inputId));
                                break;
                            } else {
                                System.out.println("Khong the tim thay Id trong Villa");
                            }
                        } while (true);
                        break;

                    case 2:
                        fileWriter.append("House");
                        fileWriter.append(COMMA_DELIMITER);
                        do {
                            System.out.println("Enter House id you want Booking");
                            String inputId = scanner.nextLine();
                            if (bookingHouse(inputId) != "NoRes") {
                                fileWriter.append(bookingHouse(inputId));
                                break;
                            } else {
                                System.out.println("Khong the tim thay Id trong House");
                            }
                        } while (true);
                        break;

                    case 3:
                        fileWriter.append("Room");
                        fileWriter.append(COMMA_DELIMITER);

                        do {
                            System.out.println("Enter Room id you want Booking");
                            String inputId = scanner.nextLine();
                            if (bookingRoom(inputId) != "NoRes") {
                                fileWriter.append(bookingRoom(inputId));
                                break;
                            } else {
                                System.out.println("Khong the tim thay Id trong Room");
                            }
                        } while (true);
                        break;

                    case 4:
                        menuBookingService();
                        break;
                    default:
                        System.out.println("Pls choice 1-4");
                        menuBookingService();
                }

                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Add Booking Completed");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(" Error in FileWriter Booking, file not found !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e){
                System.out.println("Error when flush() or close, Booking file in data");
            }
        }
    }

    public String bookVilla(String input){
        String res= "";
        ArrayList<Villa> ListVilla = services.getFileCsvVillaToList();

        for(Villa element: ListVilla){
            if(element.getId().equals(input)){
                System.out.println("Da tim duoc Villa booking");
                res = element.getId();
                return res;
            }
        }
        return "NoRes";
    };
        public String bookingHouse(String input){
        String res= "";
        ArrayList<House> ListHouse = services.getFileCsvHouseToList();

        for(House element: ListHouse){

            if(element.getId().equals(input)){
                System.out.println("Da tim duoc House booking");
                res = element.getId();
                return res;
            }
        }
        return "NoRes";
    };
    public String bookingRoom(String input){
        String res= "";
        ArrayList<Room> ListRoom = services.getFileCsvRoomToList();

        for(Room element: ListRoom){
            System.out.println("this is Room id list: " + element.getId());
            if(element.getId().equals(input)) {
                System.out.println("Da tim duoc Room booking");
                res = element.getId();
                return res;
            }
        }
        return "NoRes";
    }



    public static void ClearListBooking() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileBooking);
            fileWriter.append(HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            System.out.println("Clear list Booking Completed\n");
        } catch (Exception e){
            System.out.println("Error in fileWriter Booking, file not found");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();

            } catch (Exception e){
                System.out.println("Error when flush or close, File Booking");
            }
        }
    }

    public ArrayList<Customer> FakeList(){
        AddNewCustomer customer = new AddNewCustomer();
        System.out.println("pls choice id Card of Customer in list Customer ");
        String inputID = scanner.nextLine();
        ArrayList<Customer> customerList = customer.getFileCSVCustomerToList();
        ArrayList<Customer> ListBooking = new ArrayList<>();
        Villa villa = new Villa();


        for (Customer element: customerList){
            if(element.getIdCard().equals(inputID)) {
                System.out.println("Da tim duoc Id Card tuong ung");

//                element.setServices(Villa);
                ListBooking.add(element);
                return ListBooking;
            }
        }
        System.out.println("Khong tim duoc id trong list, vui long tim lai");
        return  ListBooking;
    };
    public void menuBookingService(){
        System.out.println("This is menu Booking Services");
        System.out.println("1. Add new Booking");
        System.out.println("2. Clear ListBooking");
        System.out.println("3. Back");
        Integer input = Integer.parseInt(scanner.nextLine());
        switch (input){
            case 1:
                WriteBookingToCSV(FakeList());
                menuBookingService();
                break;
            case 2:
                ClearListBooking();
                menuBookingService();
                break;
            case 3:
                menuBookingService();
            default:
                System.out.println("Pls choice 1 -3");
                menuBookingService();
        }
    };



}
