package CaseStudyModule2JavaCore.Controller;


import CaseStudyModule2JavaCore.Exception.EmailException;
import CaseStudyModule2JavaCore.Modes.Customer;
import CaseStudyModule2JavaCore.Modes.House;
import CaseStudyModule2JavaCore.Modes.Room;
import CaseStudyModule2JavaCore.Modes.Villa;
import CaseStudyModule2JavaCore.Validation.Validation;
import CaseStudyModule2JavaCore.Exception.*;

import javax.management.MBeanAttributeInfo;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
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
                showServices();
                displayMainMenu();
                break;
            case 3:
                menuWriteCustomer();
                displayMainMenu();
                break;
            case 4:
                AddNewCustomer customer = new AddNewCustomer();
                customer.showInformationCustomers(customer.compareCustomer());
                displayMainMenu();
            case 5:
                AddNewBooking newBooking = new AddNewBooking();
                newBooking.ShowInfoCustomerSortByIdCard();
                break;
            case 7:
                System.exit(0);
            default:
                System.out.println("input wrong, pls input again");
                displayMainMenu();
        }


    }

    public static void showServices(){
        System.out.println("Pls input List you want show");
        System.out.println("-----------------------------");
        System.out.println("1. Show all Villa");
        System.out.println("2. Show all House");
        System.out.println("3. Show all Room");
        System.out.println("4. Show All Name Villa Not Duplicate");
        System.out.println("5. Show All Name House Not Duplicate");
        System.out.println("6. Show All Name Name Not Duplicate");
        System.out.println("7. Back to menu");
        System.out.println("8. Exit");
        System.out.println("-----------");
        int inputShowService = Integer.parseInt(scanner.nextLine());
        AddNewServices new_services = new AddNewServices();
        switch (inputShowService){
            case 1:

                new_services.showInfoServiceVilla();
                break;
            case 2:
                new_services.showInfoServiceHouse();
                break;
            case 3:
                new_services.showInfoServiceRoom();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(0);
            default:
                System.out.println("Fail!, PLS enter again ...");
                scanner.nextLine();
                showServices();


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
//        String ID_PATTERN = "^SVVL-[0-9]{4}$";
//        String NAME_PATTERN = "^[A-Z]+[a-z]+$";
//        String AREA_PATTERN= "^([3-9]\\d)(\\.\\d+)?$|^([1-9][0-9]{2,})(\\.\\d+)?$";
//        String PRICE_PATTERN = "^\\d+$";
//        String MAXIMUM_PATTERN = "^[01][1-9]|10$";
//        String NUMFLOOR_PATTERN = "^\\d{1,10}";
//        String TYPERENT_PATTERN = "year|month|day";
//        String STANDARD_PATTERN = "vip|normal";

//        boolean Check = true;


//        String FREESERVICE_PATTERN= "karaoke|massage|food|drink|car";
        ArrayList<Villa> ListVilla = new ArrayList<Villa>();
        System.out.println("Enter number of villa  element you want input");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i=0; i<length;i ++){
            Villa villa = new Villa();

            System.out.println("Enter id StringType");
            villa.setId(Validation.inputAndCheckID());
            System.out.println("Enter nameService StringType");
            villa.setNameServices(scanner.nextLine());
            System.out.println("Enter areaUse DoubleType");
            villa.setArenaUse(Double.parseDouble(scanner.nextLine()));
            System.out.println("Enter rentalCosts DoubleType");
            villa.setRentalCosts(Validation.inputAndCheckValidationRentalCosts());
            System.out.println("Enter maxPeople intType");
            villa.setMaxPeople(Validation.inputAndCheckValidationMaxNumberOfPeople());
            System.out.println("Enter typeRent  StringType");
            villa.setTypeRent(scanner.nextLine());
            System.out.println("Enter roomStandard StringType");
            villa.setRoomStandard(Validation.inputAndCheckValidationTypeRentOrRoomStandard());
            System.out.println("Enter convenientDescription String ");
            villa.setConvenientDescription(scanner.nextLine());
            System.out.println("Enter areaPool  double");
            villa.setAreaPool(Validation.inputAndCheckValidationAreaUseOrAreaPool());
            System.out.println("Enter number Of Floors int");
            villa.setNumberOfFloors(Validation.inputAndCheckValidationNumberOfFloors());
            System.out.println("Enter type Villa GOOD or NORMAL");
            villa.setTypeVilla(scanner.nextLine());
            ListVilla.add(villa);
        }
        AddNewServices.WriteVillaToCSV(ListVilla);
    }
    private static void removeCacheVilla(){
        AddNewServices.removeCacheVilla();
    }
    private  static void removeCacheHouse(){
        AddNewServices.removeCacheHouse();
    }
    private static void removeCacheRoom(){
        AddNewServices.removeCacheRoom();
    }

    private static void addNewHouse(){
        ArrayList<House> ListHouse = new ArrayList<House>();
        System.out.println("Enter number of House  element you want input");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i=0; i<length;i ++){
            House house = new House();
            System.out.println("Enter id StringType");
            house.setId(scanner.nextLine());
            System.out.println("Enter nameService StringType");
            house.setNameServices(scanner.nextLine());
            System.out.println("Enter areaUse DoubleType");
            house.setArenaUse(Double.parseDouble(scanner.nextLine()));
            System.out.println("Enter rentalCosts DoubleType");
            house.setRentalCosts(Double.parseDouble(scanner.nextLine()));
            System.out.println("Enter maxPeople intType");
            house.setMaxPeople(Integer.parseInt(scanner.nextLine()));
            System.out.println("Enter typeRent  StringType");
            house.setTypeRent(scanner.nextLine());
            System.out.println("Enter type House GOOD or NORMAL only");
            house.setTypeHousee(scanner.nextLine());
            System.out.println("Enter convenientDescription String ");
            house.setConvenientDescription(scanner.nextLine());
            System.out.println("Enter number Of Floors int");
            house.setNumberOfFloors(Integer.parseInt(scanner.nextLine()));
            System.out.println("Enter address house String");
            house.setAddress_house(scanner.nextLine());

            ListHouse.add(house);
        }
        AddNewServices.WriteHouseToCSV(ListHouse);

    }
    private static void addNewRoom(){
        ArrayList<Room> ListRoom = new ArrayList<Room>();
        System.out.println("Enter number of Room  element you want input");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i=0; i<length;i ++){
            Room room = new Room();
            System.out.println("Enter id StringType");
            room.setId(scanner.nextLine());
            System.out.println("Enter nameService StringType");
            room.setNameServices(scanner.nextLine());
            System.out.println("Enter areaUse DoubleType");
            room.setArenaUse(Double.parseDouble(scanner.nextLine()));
            System.out.println("Enter rentalCosts DoubleType");
            room.setRentalCosts(Double.parseDouble(scanner.nextLine()));
            System.out.println("Enter maxPeople intType");
            room.setMaxPeople(Integer.parseInt(scanner.nextLine()));
            System.out.println("Enter typeRent StringType");
            room.setTypeRent(scanner.nextLine());
            System.out.println("Enter number of Room");
            room.setNumberOfRoom(Integer.parseInt(scanner.nextLine()));

            ListRoom.add(room);
        }
        AddNewServices.WriteRoomToCSV(ListRoom);
    }
    public static void menuWriteCustomer(){
        System.out.println("This is menu Append customer, pls choice ");
        System.out.println("1. Append new customer ");
        System.out.println("2. Clear list customer ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                AddNewCustomer.WriteCustomerToCSV(WriteCustomer());
                break;
            case 2:
                AddNewCustomer.RemoveCacheCustomer();
                break;
            default:
                System.out.println("Input wrong, choice again");
                menuWriteCustomer();
        }
    }
    public static ArrayList<Customer> WriteCustomer(){


        Customer customer = new Customer();


        do {
            try {
                System.out.println("Nhap ID Card ");
                customer.setIdCard(IdCardException.idCardException(scanner.nextLine()));
                break;
            } catch (IdCardException e){
                System.out.println(e.getMessage());
            }
        } while (true);


        System.out.println("Nhap vao Ho va ten");
        customer.setHoVaTen(Validation.inputAndCheckValidationName());

        do {try {
                System.out.println("Nhap vao ngay thang nam sinh");
                customer.setNgaySinh(BirthdayException.birthdayException(scanner.nextLine()));
                break;
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }
        } while (true);



//        customer.setGioiTinh(scanner.nextLine());
        do {
            try {
                System.out.println("Nhap vao gioiTinh");
                customer.setGioiTinh(GenderException.genderException(scanner.nextLine()));
                break;
            } catch (GenderException e){
                System.out.println(e.getMessage());
            }
        } while (true);


        System.out.println("Nhap vao CMND");
        customer.setCMND(Long.parseLong(scanner.nextLine()));
        System.out.println("Nhap vao SDT");
        customer.setSDT(Long.parseLong(scanner.nextLine()));


        do {
            try {
                System.out.println("Nhap vao Email");
                customer.setEmail(EmailException.emailException(scanner.nextLine()));
                break;
            } catch (EmailException e){
                System.out.println(e.getMessage());
            }
        } while (true);


        System.out.println("Nhap vao loai khach hang");
        customer.setLoaiKhach(scanner.nextLine());
        System.out.println("Nhap vao dia chi khach hang");
        customer.setDiaChi(scanner.nextLine());

        ArrayList<Customer> ListCustomer= new ArrayList<>();
        ListCustomer.add(customer);
        return ListCustomer;
    }



    public static void main(String[] args) {
        displayMainMenu();
    }
}
