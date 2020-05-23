package CaseStudyModule2JavaCore.Exception;

import java.time.LocalDate;
import java.util.Scanner;

public class BirthdayException extends Exception {
    public BirthdayException(String message) {
        super(message);
    }

    public static String birthdayException(String birthdayCustomer) throws BirthdayException {
        String regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
        LocalDate date = LocalDate.now();
        if (birthdayCustomer.matches(regex)) {
            String temp = "";
            for (int i = birthdayCustomer.length() - 4; i < birthdayCustomer.length(); i++) {
                temp += birthdayCustomer.charAt(i);
            }
            Integer year=new Integer(temp);
            if (date.getYear() - year >= 10 && year>1900 ) {
                return birthdayCustomer;
            } else {
                throw new BirthdayException("Năm sinh phải > 1900 và nhỏ hơn năm hiện tại 10 năm.");
            }

        } else {
            throw new BirthdayException("Ngày tháng năm sinh không đúng định dạng\n Vui lòng nhập theo định dạng XX/YY/ZZZZ");
        }
    }
}
