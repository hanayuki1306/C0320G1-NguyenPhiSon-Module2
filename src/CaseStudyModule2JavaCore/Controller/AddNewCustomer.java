package CaseStudyModule2JavaCore.Controller;

import CaseStudyModule2JavaCore.Modes.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class AddNewCustomer {
    public static Scanner scanner = new Scanner(System.in);
    private static final String fileInfoCustomer = "src/CaseStudyModule2JavaCore/Data/CustomerInfo.csv";
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String HEADER = "ID Card, HovaTen, NgaySinh, CMND, GioiTinh, SDT, Email, LoaiKhach, Dia Chi, Services";

    public static void WriteCustomerToCSV(ArrayList<Customer> ListCustomer){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileInfoCustomer, true);

            for (Customer customer: ListCustomer){
                fileWriter.append(customer.getIdCard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getHoVaTen());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getNgaySinh());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getGioiTinh());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getCMND()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getSDT()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getLoaiKhach());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getDiaChi());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(customer.getServices());
//                fileWriter.append(COMMA_DELIMITER);

                fileWriter.append(NEW_LINE_SEPARATOR);

            }
            System.out.println("Add customer Completed");

        } catch (Exception e) {
            System.out.println(" Error in FileWriter Customer, file not found !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e){
                System.out.println("Error when flush() or close, CustomerInfo file");
            }
        }
    }
    public static void RemoveCacheCustomer(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileInfoCustomer);
            fileWriter.append(HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            System.out.println("Remove Customer Completed\n");
        } catch (Exception e){
            System.out.println("Error in fileWriter, file not found");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();

            } catch (Exception e){
                System.out.println("Error when flush or close, File Customer");
            }
        }
    }
    public ArrayList<Customer> getFileCSVCustomerToList(){
        BufferedReader br = null;
        ArrayList<Customer> CustomerList = new ArrayList<>();
        try {
            String line;
            br = new BufferedReader(new FileReader(fileInfoCustomer));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("ID Card")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setIdCard(splitData[0]);
                customer.setHoVaTen(splitData[1]);
                customer.setNgaySinh(splitData[2]);
                customer.setGioiTinh(splitData[3]);
                customer.setCMND(Long.parseLong(splitData[4]));
                customer.setSDT(Long.parseLong(splitData[5]));
                customer.setEmail(splitData[6]);
                customer.setLoaiKhach(splitData[7]);
                customer.setDiaChi(splitData[8]);

                CustomerList.add(customer);

            }
            System.out.println("completed getFileCsv customer to list");
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return CustomerList;
    }
    public void showInformationCustomers(ArrayList<Customer> ListCustomer){
        compareCustomer();
//        ArrayList<Customer> ListCustomer = getFileCSVCustomerToList();

        for (Customer customer: ListCustomer){
            System.out.println("---------------------------\n");
            System.out.println("ID Card: " + customer.getIdCard() +
                    ", Ho va Ten: " + customer.getHoVaTen() +
                    ", Ngay Sinh: " + customer.getNgaySinh() +
                    ", CMND: " + customer.getCMND() +
                    ", Gioi Tinh: " + customer.getGioiTinh() +
                    ", SDT: " + customer.getSDT() +
                    ", Email: " +customer.getEmail()+
                    ", Loai khach: " + customer.getLoaiKhach() +
                    ", DiaChi: " + customer.getDiaChi()
            );
        }
    }
    class SortUseComparator implements Comparator<Customer> {

        @Override
        public int compare(Customer customer, Customer customer1) {
            System.out.println("this is res of compare" + customer.getHoVaTen().compareTo(customer1.getHoVaTen()));
            if (customer.getHoVaTen().compareTo(customer1.getHoVaTen()) == 0){
                customer.getNgaySinh().compareTo(customer1.getNgaySinh());
                System.out.println("this is compare Ngay Sinh" + customer.getNgaySinh().compareTo(customer1.getNgaySinh()));
                return customer.getNgaySinh().compareTo(customer1.getNgaySinh());
            } else {
                return customer.getHoVaTen().compareTo(customer1.getHoVaTen());
            }
        }
    };

    public ArrayList<Customer> compareCustomer(){
        ArrayList<Customer> CustomerList = getFileCSVCustomerToList();
        Collections.sort(CustomerList, new SortUseComparator());
        return  CustomerList;
    };
}
