package CaseStudyModule2JavaCore.Controller;
import CaseStudyModule2JavaCore.Modes.Villa;

import java.io.*;
import java.util.*;
public class Add_new_services {
    public void Write_data_Villa(String filePath) {
        File file = new File(filePath);
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);

//            // create CSVWriter object filewriter object as parameter
//            CSVWriter writer = new CSVWriter(outputfile);
//
//            // create a List which contains String array
//            List<String[]> data = new ArrayList<String[]>();
//            data.add(new String[] { "Name", "Class", "Marks" });
//            data.add(new String[] { "Aman", "10", "620" });
//            data.add(new String[] { "Suraj", "10", "630" });
//            writer.writeAll(data);
//
//            // closing writer connection
//            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
        public void Add_new_Villa (){


    };
}
