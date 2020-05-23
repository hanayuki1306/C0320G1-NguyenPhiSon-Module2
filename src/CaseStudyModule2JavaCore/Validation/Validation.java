package CaseStudyModule2JavaCore.Validation;

import java.util.Scanner;

public class Validation {
    private static String regex = "";
    static Scanner scanner = new Scanner(System.in);

    public static String inputAndCheckID(){
        regex = "^[\\d]{1,}$";
        while (true){
            scanner = new Scanner(System.in);
            System.out.println("Enter id with no Character");
            String id = scanner.nextLine();
            if (id.matches(regex)){
                return id;
            } else {
                System.out.println("Id invalid ");
            }
        }
    }

    public static String inputAndCheckValidationName() {
        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("Enter name (Format: Abc Abc Abc Abc): ");
            String name = scanner.nextLine();
            if (name.matches(regex)) {
                return name;
            } else {
                System.out.println("Tên không đúng định dạng");
            }
        }
    }

    public static String inputAndCheckValidationTypeRentOrRoomStandard() {

        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        while (true) {
            scanner = new Scanner(System.in);
            System.out.println("TypeRent or RoomStandard must follow format Abcadsaaf with no space");
            String typeRentOrRoomStandard = scanner.nextLine();
            if (typeRentOrRoomStandard.matches(regex)) {
                return typeRentOrRoomStandard;
            } else {
                System.out.println("Kiểu thuê hoặc tiêu chuẩn phòng không đúng định dạng");
                System.out.print("Mời bạn nhập lại: ");
            }
        }
    }


    public static Double inputAndCheckValidationAreaUseOrAreaPool() {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                Double area = scanner.nextDouble();
                if (area > 30) {
                    return area;
                } else {
                    System.out.println("Area phải lớn hơn 30");
                    System.out.print("Mời bạn nhập lại: ");
                }
            } catch (Exception e) {
                System.out.println("Nhập sai kiểu dữ liệu");
                System.out.print("Mời bạn nhập lại: ");
            }
        }
    }
    public static Double inputAndCheckValidationRentalCosts() {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Enter Rental Costs: ");
                Double rentalCosts = scanner.nextDouble();
                if (rentalCosts > 0) {
                    return rentalCosts;
                } else {
                    System.out.println("Rental Costs phải là số dương");
                }
            } catch (Exception e) {
                System.out.println("Nhập sai kiểu dữ liệu");
            }
        }
    }


    public static Integer inputAndCheckValidationMaxNumberOfPeople() {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Enter Max Number Of People: ");
                int maxNumberOfPeople = scanner.nextInt();
                if (maxNumberOfPeople > 0 && maxNumberOfPeople < 20) {
                    return maxNumberOfPeople;
                } else {
                    System.out.println("Max Number Of People phải lớn hơn 0 và nhỏ hơn 20!");
                }
            } catch (Exception e) {
                System.out.println("Nhập sai kiểu dữ liệu");
            }
        }
    }
    public static Integer inputAndCheckValidationNumberOfFloors() {
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Enter Number Of Floors: ");
                Integer numberOfFloors = scanner.nextInt();
                if (numberOfFloors > 0) {
                    return numberOfFloors;
                } else {
                    System.out.println("Number Of Floors phải là số nguyên dương");
                }
            } catch (Exception e) {
                System.out.println("Nhập sai kiểu dữ liệu");
            }
        }
    }
}
