package CaseStudyModule2JavaCore.Exception;

import CaseStudyModule2JavaCore.Controller.AddNewCustomer;
import CaseStudyModule2JavaCore.Modes.Customer;

import java.util.ArrayList;


public class IdCardException extends Exception {
    public IdCardException(String s){
        super(s);
    }
    public static String idCardException(String idCard) throws IdCardException {

        AddNewCustomer newCustomer = new AddNewCustomer();
        String[] ListID = newCustomer.getListIdCard();

        String regex="^\\d{3}\\s\\d{3}\\s\\d{3}$";
        if (idCard.matches(regex)) {
            for (String customerID: ListID){
                if (customerID.equals(idCard)){
                    throw new IdCardException(" Id card khong duoc trung");
                } return idCard;
            }
            return idCard;
        } else {
            throw new IdCardException("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX");
        }
//        return idCard;
    }
}
