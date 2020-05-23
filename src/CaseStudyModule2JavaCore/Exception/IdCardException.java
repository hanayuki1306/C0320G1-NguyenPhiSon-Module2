package CaseStudyModule2JavaCore.Exception;

public class IdCardException extends Exception {
    public IdCardException(String s){
        super(s);
    }
    public static String idCardException(String idCard) throws IdCardException {
        String regex="^\\d{3}\\s\\d{3}\\s\\d{3}$";
        if (idCard.matches(regex)) {
            return idCard;
        } else {
            throw new IdCardException("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX");
        }
    }
}
