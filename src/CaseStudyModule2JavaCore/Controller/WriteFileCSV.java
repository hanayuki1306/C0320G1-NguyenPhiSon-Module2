package CaseStudyModule2JavaCore.Controller;

import CaseStudyModule2JavaCore.Modes.TypeVilla;
import CaseStudyModule2JavaCore.Modes.Villa;

import java.io.FileWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFileCSV {
}
//    private static final String filenameVilla = "src/CaseStudyModule2JavaCore/Data/Villa.csv";
//    private static final String filenameHouse = "src/CaseStudyModule2JavaCore/Data/House.csv";
//    private static final String filenameRoom = "src/CaseStudyModule2JavaCore/Data/Room.csv";
//    private static final String COMMA_DELIMITER = ",";
//    private static final String NEW_LINE_SEPARATOR = "\n\n";
//    private static final String HEADER = " HEADER";
//
//
//    public static void WriteDataToCSV(ArrayList<Villa>  ListVilla){
//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter(filenameVilla);
//            fileWriter.append(HEADER);
//            fileWriter.append(NEW_LINE_SEPARATOR);
//            for (Villa villa: ListVilla){
//                fileWriter.append(villa.toString());
//                fileWriter.append(NEW_LINE_SEPARATOR);
//            }
//
//            System.out.println("Add villa compelete");
//        } catch (Exception ex){
//            System.out.println("Error, in FileWriter, file not found!!!");
//        } finally {
//            try {
//                fileWriter.flush();
//                fileWriter.close();
//            } catch (Exception ex){
//                System.out.println("ERROR when flush or close");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Villa> ListVilla = new ArrayList<Villa>();
//        Villa villa1 = new Villa();
//        ListVilla.add(villa1);
//        Villa villa2 = new Villa("13","haha", 12,12,1,"ds","hsfhs","metmoi",12,12, TypeVilla.GOOD);
//
//        ListVilla.add(villa2);
//        WriteDataToCSV(ListVilla);
//
//    }
//
//}
