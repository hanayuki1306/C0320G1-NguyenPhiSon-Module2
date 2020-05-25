package CaseStudyModule2JavaCore.Controller;

import CaseStudyModule2JavaCore.Modes.Customer;
import CaseStudyModule2JavaCore.Modes.Employee;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class AddNewEmployee {
    public static Scanner scanner = new Scanner(System.in);
    private static final String fileInfoEmployee = "src/CaseStudyModule2JavaCore/Data/Employee.csv";
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String HEADER = "ID, Name, Age, Address";


    public void menuShowEmployee(){
        System.out.println("1. Show all employee");
        System.out.println("2. Clear list employee");
        System.out.println("3. Add employee");
        String input = scanner.nextLine();
        switch (input){
            case "1":
                showInformationEmployee();
                MainController.displayMainMenu();
                break;
            case "2":
                RemoveListEmployee();
                MainController.displayMainMenu();
                break;
            case "3":
                WriteEmployeeToCSV(WriteListEmployee());
                MainController.displayMainMenu();

            default:
                break;
        }
    };
    public static ArrayList<Employee> WriteListEmployee(){
        Employee employee = new Employee();
        System.out.println("Nhap vao id");
        employee.setIdEmployee(scanner.nextLine());
        System.out.println("Nhap vao Ho va ten");
        employee.setNameEmployee(scanner.nextLine());
        System.out.println("Nhap vao tuoi");
        employee.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap vao dia chi");
        employee.setAddress(scanner.nextLine());

        ArrayList<Employee> ListEmployee = new ArrayList<>();
        ListEmployee.add(employee);
        return ListEmployee;
    }

    public static void  WriteEmployeeToCSV(ArrayList<Employee> ListEmployee){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileInfoEmployee, true);

            for (Employee employee: ListEmployee){
                fileWriter.append(employee.getIdEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getNameEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(employee.getAge()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getAddress());

                fileWriter.append(NEW_LINE_SEPARATOR);

            }
            System.out.println("Add Employee Completed");

        } catch (Exception e) {
            System.out.println(" Error in FileWriter Employee, file not found !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e){
                System.out.println("Error when flush() or close, CustomerInfo file");
            }
        }
    }

    public static void RemoveListEmployee(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileInfoEmployee);
            fileWriter.append(HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            System.out.println("Remove Employee Completed\n");
        } catch (Exception e){
            System.out.println("Error in fileWriter, file not found");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();

            } catch (Exception e){
                System.out.println("Error when flush or close, File Employee");
            }
        }
    }
    public ArrayList<Employee> getFileCSVEmployeeToList(){
        BufferedReader br = null;
        ArrayList<Employee> EmployeeList = new ArrayList<>();
        try {
            String line;
            br = new BufferedReader(new FileReader(fileInfoEmployee));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("ID")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setIdEmployee(splitData[0]);
                employee.setNameEmployee(splitData[1]);
                employee.setAge(Integer.parseInt(splitData[2]));
                employee.setAddress(splitData[3]);

                EmployeeList.add(employee);

            }
            System.out.println("completed getFileCsv Employee to list");
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return EmployeeList;
    }
//    }

    public void showInformationEmployee(){
        Scanner scanner = new Scanner(System.in);
        AddNewEmployee newListemployee = new AddNewEmployee();
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = newListemployee.getFileCSVEmployeeToList();
        Map<Integer, Employee> map = new HashMap<>();
        int i = 0;
        for (Employee employee: listEmployee) {
            i++;
            map.put(i, employee);
        }
        Set<Integer> set = map.keySet();
        for (Integer key: set){
            System.out.println(key + " "+ map.get(key));
        }
        System.out.println("Enter to continue");
        scanner.nextLine();
        MainController.displayMainMenu();
    }

}
